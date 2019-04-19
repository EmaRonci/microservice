package com.example.demo;

import org.springframework.data.annotation.Id;

public class Model {
    @Id
    public int id;
    public String title;
    public String content;
}