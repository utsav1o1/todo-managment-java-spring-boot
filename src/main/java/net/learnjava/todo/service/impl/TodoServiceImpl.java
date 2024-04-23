package net.learnjava.todo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.learnjava.todo.dto.TodoDto;
import net.learnjava.todo.entity.Todo;
import net.learnjava.todo.repository.TodoRepository;
import net.learnjava.todo.service.TodoService;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public TodoDto addTodo(TodoDto todoDto) {
		
		// convert TodoDto into Todo Jpa entity
        Todo todo = modelMapper.map(todoDto, Todo.class);
   
        // Todo Jpa entity
        Todo savedTodo = todoRepository.save(todo);

        // Convert saved Todo Jpa entity object into TodoDto object

        TodoDto savedTodoDto = modelMapper.map(savedTodo, TodoDto.class);

        return savedTodoDto;

		
	}
		
	 

}
