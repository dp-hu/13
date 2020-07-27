package net.togogo.controller;

import net.togogo.bean.User;
import net.togogo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/adduser")
    public String addUser(User user){
        userService.userAdd(user);
        return "success";
    }
}
