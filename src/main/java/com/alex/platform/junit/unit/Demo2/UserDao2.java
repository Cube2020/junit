package com.alex.platform.junit.unit.Demo2;

import org.springframework.stereotype.Component;

@Component
public class UserDao2 {
    public User2 getUserById(String userId){
        User2 user1 = new User2("1001","alex",28);
        User2 user2 = new User2("1002","bills",30);
        return userId.equals("1001")?user1:user2;
    }
}
