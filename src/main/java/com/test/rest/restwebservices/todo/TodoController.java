package com.test.rest.restwebservices.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@GetMapping(path = "/getAllTodos/{name}")
	private List<Todo> getAllTodos(@PathVariable String name){
		System.out.println("in todo...");
		return service.getAllTodos();
		
	}
	
	

}
