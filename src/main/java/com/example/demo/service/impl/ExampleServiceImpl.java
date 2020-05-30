package com.example.demo.service.impl;

import com.example.demo.model.Example;
import com.example.demo.repo.ExampleRepo;
import com.example.demo.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    private final ExampleRepo exampleRepo;

    @Override
    public void save(Example example) {
        exampleRepo.execute(exampleRepo.save(example));
    }

    @Override
    public void delete(String id) {
        exampleRepo.execute(exampleRepo.delete(id));
    }
}
