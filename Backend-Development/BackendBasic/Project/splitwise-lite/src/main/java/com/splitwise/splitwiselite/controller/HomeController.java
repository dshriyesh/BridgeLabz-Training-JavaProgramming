package com.splitwise.splitwiselite.controller;

import com.splitwise.splitwiselite.service.GroupService;
import com.splitwise.splitwiselite.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final GroupService groupService;
    private final UserRepository userRepo;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("groups", groupService.getAllGroups());
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }
}