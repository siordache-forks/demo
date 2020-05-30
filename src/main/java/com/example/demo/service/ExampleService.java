package com.example.demo.service;

import com.example.demo.model.Example;

public interface ExampleService {
    void save(Example example);
    void delete(String id);
}
