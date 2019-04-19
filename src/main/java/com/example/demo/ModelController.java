package com.example.demo;

import java.util.List;

import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/endpoint")
public class ModelController {

    private ModelRepository modelRepository;

    @Autowired
    public ModelController(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @GetMapping
    @ResponseBody
    public List<Model> findAll() {
        return Lists.newArrayList(modelRepository.findAll());
    }

    @PostMapping
    public void insertOne(@RequestBody Model model) {
        modelRepository.save(model);
    }
}