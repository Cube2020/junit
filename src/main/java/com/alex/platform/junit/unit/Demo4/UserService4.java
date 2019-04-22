package com.alex.platform.junit.unit.Demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService4 {
    @Autowired
    private UserDao4 userDao;

    public User4 query(String userId) {
        return userDao.getUserById(userId);
    }
}
