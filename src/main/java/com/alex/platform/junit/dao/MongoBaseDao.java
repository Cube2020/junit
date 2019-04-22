package com.alex.platform.junit.dao;

import com.alex.platform.junit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

public class MongoBaseDao<T> {

    protected Class<T> entityClass;
    @Autowired
    private MongoTemplate mongoTemplate;

    public User findOne(Query query) {
        return mongoTemplate.findOne(query, User.class);
    }
}
