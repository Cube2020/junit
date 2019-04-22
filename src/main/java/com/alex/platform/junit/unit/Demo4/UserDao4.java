package com.alex.platform.junit.unit.Demo4;

import org.springframework.stereotype.Component;

@Component
public class UserDao4 {
    public User4 getUserById(String userId){
        User4 user1 = new User4("1001","alex",28);
        User4 user2 = new User4("1002","bills",30);
        return userId.equals("1001")?user1:user2;
    }
}
