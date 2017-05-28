package com.jvdemo.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jvdemo.login.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {
}
