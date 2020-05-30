package com.example.demo.repo;

import com.example.demo.model.Example;
import org.jooq.Query;

public interface ExampleRepo {
    Query save(Example entity);
    Query delete(String id);
    int execute(Query query);
}
