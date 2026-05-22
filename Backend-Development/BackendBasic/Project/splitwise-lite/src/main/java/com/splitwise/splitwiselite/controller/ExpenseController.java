package com.splitwise.splitwiselite.controller;

import com.splitwise.splitwiselite.dto.ExpenseRequest;
import com.splitwise.splitwiselite.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/expense")

@RequiredArgsConstructor

public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping("/add")

    public String addExpense(
            @RequestBody
            ExpenseRequest request) {

        return expenseService
                .addExpense(request);
    }
}