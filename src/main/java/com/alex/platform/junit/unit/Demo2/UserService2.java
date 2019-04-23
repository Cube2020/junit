package com.alex.platform.junit.unit.Demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService2 {
    @Autowired
    private UserDao2 userDao;

    public User2 query(String userId) {
        return userDao.getUserById(userId);
    }
}
