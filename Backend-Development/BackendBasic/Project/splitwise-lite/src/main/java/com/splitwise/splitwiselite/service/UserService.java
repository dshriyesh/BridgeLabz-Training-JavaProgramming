package com.splitwise.splitwiselite.service;

import com.splitwise.splitwiselite.model.User;
import com.splitwise.splitwiselite.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;


    // Create user
    public User createUser(User user) {

        return repository.save(user);
    }


    // Get all users
    public List<User> getAllUsers() {

        return repository.findAll();
    }
}