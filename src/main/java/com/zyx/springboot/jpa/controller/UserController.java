package com.zyx.springboot.jpa.controller;


import com.zyx.springboot.jpa.entity.User;
import com.zyx.springboot.jpa.repository.UserRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepositroy userRepositroy;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id)
    {
        return userRepositroy.getOne(id);
    }

    @GetMapping("/user")
    public User insertUser(User user)
    {
        return userRepositroy.save(user);
    }
}
