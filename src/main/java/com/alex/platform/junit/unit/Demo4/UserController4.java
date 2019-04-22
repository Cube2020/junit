package com.alex.platform.junit.unit.Demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController4 {
    @Autowired
    private UserService4 userService;

    @RequestMapping(value = "getUserById")
    @ResponseBody
    public User4 getUserById(@RequestParam(value = "userId", required = true) String userId, Model model) {
        User4 user = userService.query(userId);
        return user;
    }
}
