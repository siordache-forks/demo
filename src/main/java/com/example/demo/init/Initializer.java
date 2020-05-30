package com.example.demo.init;

import com.example.demo.model.Example;
import com.example.demo.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Initializer implements ApplicationRunner {

    private final ExampleService exampleService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Example example = new Example();
        example.setId("key");
        example.setName("name");
        exampleService.save(example);
        System.out.println("Example saved");
        exampleService.delete(example.getId());
        System.out.println("Example deleted");
    }
}
