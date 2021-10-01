package com.test.rest.restwebservices.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	static List<Todo> todos = new ArrayList<>();
	private static int id = 0;
	
	static {
		todos.add(new Todo("Rajitha", ++id, "practise Java" , false));

		todos.add(new Todo("Ram", ++id, "practise Angular" , false));
	}
	public List<Todo> getAllTodos() {
		return todos;
	}

}
