package com.example.demo;

import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Model {
    @Id
    @JsonProperty(access = Access.READ_ONLY)
    public String id;

    public String title;

    public String content;

    public String author;

    public String created;
}