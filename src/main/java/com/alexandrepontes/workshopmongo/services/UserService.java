package com.alexandrepontes.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandrepontes.workshopmongo.domain.User;
import com.alexandrepontes.workshopmongo.repository.UserRepository;

@Service 
	public class UserService {
	
	@Autowired
	private UserRepository repo; //automatic dependencies injection
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
