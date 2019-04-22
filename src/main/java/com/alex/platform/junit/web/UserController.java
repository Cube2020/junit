package com.alex.platform.junit.web;

import com.alex.platform.junit.model.User;
import com.alex.platform.junit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAgeInfoById", method = RequestMethod.GET, produces = "text/html")
    @ResponseBody
    public String findUserNameById(@RequestParam String userId) {
        return userService.getUserAgeInfo(userId);
    }
}
