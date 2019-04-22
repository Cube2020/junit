package com.alex.platform.junit.dao;

import com.alex.platform.junit.model.User;
import com.alex.platform.junit.model.UserColumn;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends MongoBaseDao<User> {
    public User findByUserId(String userId) {
        return findOne(Query.query(Criteria.where(UserColumn.userId.getName()).is(userId)));
    }
}
