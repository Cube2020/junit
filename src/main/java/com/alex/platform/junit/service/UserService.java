package com.alex.platform.junit.service;

import com.alex.platform.junit.dao.Engineer;
import com.alex.platform.junit.dao.UserDao;
import com.alex.platform.junit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public String getUserAgeInfo(String userId) {
        User user = userDao.findByUserId(userId);
        //Complex logic judgment for actual,example
        if (user != null) {
            return user.getAge() > 30 ? Engineer.OLD.getName() : Engineer.YOUNG.getName();
        }
        return "";
    }
}

