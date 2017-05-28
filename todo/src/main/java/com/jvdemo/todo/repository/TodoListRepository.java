package com.jvdemo.todo.repository;

import com.jvdemo.todo.entity.TodoList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoListRepository extends MongoRepository<TodoList, String> {
}
