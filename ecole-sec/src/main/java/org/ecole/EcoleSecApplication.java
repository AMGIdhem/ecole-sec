package org.ecole;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.ecole.dao.EtudiantRepository;
import org.ecole.entites.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EcoleSecApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(EcoleSecApplication.class, args);
//		EtudiantRepository etudiantRepository=ctx.getBean(EtudiantRepository.class);
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		etudiantRepository.save(new Etudiant("mahdi", "mahdi", df.parse("1998-09-07")));
//		etudiantRepository.save(new Etudiant("hanane", "hanane", df.parse("1999-09-07")));
//		etudiantRepository.save(new Etudiant("ali", "ali", df.parse("1996-12-22")));
//		etudiantRepository.save(new Etudiant("sara", "sara", df.parse("2001-03-17")));
//		etudiantRepository.save(new Etudiant("ahmed", "ahmed", df.parse("1998-10-03")));
//		List<Etudiant> etds = etudiantRepository.findAll();
//		etds.forEach(e->System.out.println(e.getNom()));
	}

}
