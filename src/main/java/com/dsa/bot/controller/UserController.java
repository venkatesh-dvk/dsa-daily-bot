package com.dsa.bot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dsa.bot.dto.UserRequest;
import com.dsa.bot.entity.User;
import com.dsa.bot.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@Valid @RequestBody UserRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setPhone(request.getPhone());

        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}