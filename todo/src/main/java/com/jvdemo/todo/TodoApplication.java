package com.jvdemo.todo;

import com.jvdemo.todo.entity.Entry;
import com.jvdemo.todo.entity.TodoList;
import com.jvdemo.todo.repository.TodoListRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.stream.Stream;

import static java.util.Arrays.asList;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories({"com.jvdemo.todo.repository"})
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TodoListRepository repository) {
		return result -> {
			Stream.of(new TodoList("1", asList(
					new Entry("Get up", true),
					new Entry("Jogging", false),
					new Entry("Start reading new book", true))))
					.forEach(repository::save);
		};
	}
}
