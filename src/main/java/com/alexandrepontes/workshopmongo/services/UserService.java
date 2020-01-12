package com.alexandrepontes.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandrepontes.workshopmongo.domain.User;
import com.alexandrepontes.workshopmongo.dto.UserDTO;
import com.alexandrepontes.workshopmongo.repository.UserRepository;
import com.alexandrepontes.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo; // automatic dependencies injection

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User insert(User obj) {
		return repo.insert(obj);
	}

	public void delete(String id) {

		findById(id);
		repo.deleteById(id);

	}
	
	public User update(User obj) {
		User newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
		}

	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
		
	}

	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}

}
