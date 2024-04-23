package net.learnjava.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.learnjava.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
 