package com.example.demo.repo.impl;

import com.example.demo.Tables;
import com.example.demo.model.Example;
import com.example.demo.repo.ExampleRepo;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Query;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ExampleRepoImpl implements ExampleRepo {

    private final DSLContext dslContext;

    @Override
    public Query save(Example entity) {
        return dslContext
            .insertInto(Tables.EXAMPLE)
            .columns(Tables.EXAMPLE.ID, Tables.EXAMPLE.NAME)
            .values(entity.getId(), entity.getName());
    }

    @Override
    public Query delete(String id) {
        return dslContext.deleteFrom(Tables.EXAMPLE).where(Tables.EXAMPLE.ID.eq(id));
    }

    @Override
    public int execute(Query query) {
        return dslContext.execute(query);
    }
}
