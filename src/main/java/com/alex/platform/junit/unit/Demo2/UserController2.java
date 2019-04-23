package com.alex.platform.junit.unit.Demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController2 {
    @Autowired
    private UserService2 userService;

    @RequestMapping(value = "getUserById")
    @ResponseBody
    public User2 getUserById(@RequestParam(value = "userId", required = true) String userId, Model model) {
        User2 user = userService.query(userId);
        return user;
    }
}
