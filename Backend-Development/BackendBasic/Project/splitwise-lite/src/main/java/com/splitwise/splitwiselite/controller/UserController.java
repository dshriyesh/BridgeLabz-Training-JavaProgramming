package com.splitwise.splitwiselite.controller;

import com.splitwise.splitwiselite.model.User;
import com.splitwise.splitwiselite.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;


    @PostMapping("/create")
    public User create(
            @RequestBody User user) {

        return service.createUser(user);
    }


    @GetMapping
    public List<User> getAll() {

        return service.getAllUsers();
    }
}
