package org.ecole.service;

import org.ecole.dao.EtudiantRepository;
import org.ecole.entites.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantRestService {
	@Autowired
	private EtudiantRepository etudiantRepository;
	@RequestMapping(value="/saveEtudiant",method=RequestMethod.GET)
	public Etudiant saveEtudiant(Etudiant e) {
		return etudiantRepository.save(e);
	}
	@RequestMapping(value="/etudiants")
	public Page<Etudiant> listEtudiants(int page, int size){
		Pageable maPage = PageRequest.of(page, size);
		return etudiantRepository.findAll(maPage);
	}
}
