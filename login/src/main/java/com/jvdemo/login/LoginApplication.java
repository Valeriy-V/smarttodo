package com.jvdemo.login;

import com.jvdemo.login.entity.User;
import com.jvdemo.login.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories({"com.jvdemo.login.repository"})
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return result -> {
			Stream.of(
							new User("1", "Batman123", "batman@gmail.com", "bb112233"),
							new User("2", "SuperMan2005", "sm@gmail.com", "super2005"),
							new User("3", "AmazingWoman2000", "aw2000@gmail.com", "amazing2000"))
							.forEach(repository::save);
		};
	}
}
