package com.jvdemo.login.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "USERS")
public class User {

  @Id
  private String id;

  private String login;
  private String email;
  private String password;

  public User(){}

  public User(String id, String login, String email, String password) {
    this.id = id;
    this.login = login;
    this.email = email;
    this.password = password;
  }
}
