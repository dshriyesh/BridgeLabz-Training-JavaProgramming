package com.splitwise.splitwiselite.controller;

import com.splitwise.splitwiselite.model.Balance;
import com.splitwise.splitwiselite.repository.BalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/balance")

@RequiredArgsConstructor

public class BalanceController {

    private final BalanceRepository balanceRepository;

    @GetMapping("/{userId}")

    public List<Balance>
    getBalance(
            @PathVariable
            Long userId) {

        return balanceRepository
                .findByDebtorId(userId);
    }
}