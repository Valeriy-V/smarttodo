package com.jvdemo.todo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "todoLists")
public class TodoList {

    @Id
    private String id;

    private List<Entry> entryList;

    public TodoList(String id, List<Entry> entryList)
    {
        this.id = id;
        this.entryList = entryList;
    }
}
