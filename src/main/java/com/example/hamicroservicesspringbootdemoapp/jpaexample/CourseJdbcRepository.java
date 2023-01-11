package com.example.hamicroservicesspringbootdemoapp.jpaexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private static final String insertQuery =
            """
            insert into course (id, name, author)
            values (1, 'Microservices', 'Ranga Karanam');
            """;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        jdbcTemplate.update(insertQuery);
    }
}
