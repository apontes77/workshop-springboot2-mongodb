package com.alexandrepontes.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexandrepontes.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<User>> findAll(){
			User alex = new User("1", "Alex Green", "alex@gmail.com");
			User maria = new User("2", "Maria Brown", "maria@gmail.com");
			
			List<User> list = new ArrayList<>();
			list.addAll(Arrays.asList(alex,maria));
			return ResponseEntity.ok().body(list);
		}
}
