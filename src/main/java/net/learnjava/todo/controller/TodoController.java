package net.learnjava.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.learnjava.todo.dto.TodoDto;
import net.learnjava.todo.service.TodoService;

@RestController
@RequestMapping("api/todos")
@AllArgsConstructor
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	//build add TODO REST API
	     
	@PostMapping
	public ResponseEntity<TodoDto> addTodo( @RequestBody TodoDto todoDto)
	{  
	
	    
		TodoDto savedTodoDto = todoService.addTodo(todoDto);
		return new ResponseEntity<TodoDto>(savedTodoDto, HttpStatus.CREATED);
	}
}
