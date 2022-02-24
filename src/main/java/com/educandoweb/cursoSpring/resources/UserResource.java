package com.educandoweb.cursoSpring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.cursoSpring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User u = new User(1, "Maria", "maria@gmail.com", "9999999", "12345");
		User o = new User(1, "Joao", "joao@gmail.com", "11111111", "12345");
		
		List<User> list = new ArrayList<>();
		list.add(u);
		list.add(o);
		
		
		return ResponseEntity.ok().body(list);
	}
}
