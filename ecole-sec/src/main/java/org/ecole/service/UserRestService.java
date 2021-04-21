package org.ecole.service;

import java.util.List;
import java.util.Optional;

import org.ecole.dao.RoleRepository;
import org.ecole.dao.UserRepository;
import org.ecole.entites.Role;
import org.ecole.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.annotation.Secured;

@RestController
@Secured(value={"ROLE_ADMIN"})
public class UserRestService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	@RequestMapping(value="/addUser")
	public User save(User u) {
		return userRepository.save(u);
	}
	
	@RequestMapping(value="/findUsers")
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@RequestMapping(value="/addRole")
	public Role save(Role r) {
		return roleRepository.save(r);
	}
	
	@RequestMapping(value="/findRoles")
	public List<Role> findRoles() {
		return roleRepository.findAll();
	}
	
	@RequestMapping(value="/addRoleToUser")
	public User addRoleToUser(String username, String role) {
		User u=userRepository.getOne(username);
		Role r=roleRepository.getOne(role);
		u.getRoles().add(r);
		userRepository.save(u);
		return u;
	}
}
