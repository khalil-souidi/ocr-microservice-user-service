package com.example.demo.controller;

import com.example.demo.UserServiceApplication;
import com.example.demo.entites.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping
    public List<User> getAllUsers() {
        return userService.FindAllUsers();
    }

}
