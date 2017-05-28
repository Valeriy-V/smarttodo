package com.jvdemo.todo.entity;

import lombok.Data;

@Data
public class Entry {

    private String description;
    private boolean isDone;
}
