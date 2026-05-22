package com.splitwise.splitwiselite.service;

import com.splitwise.splitwiselite.model.Balance;
import com.splitwise.splitwiselite.repository.BalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class BalanceService {

    private final BalanceRepository balanceRepo;

    // Who does this user owe?
    public List<Balance> getDebts(Long userId) {

        return balanceRepo.findByDebtorId(userId);
    }

    // Who owes this user?
    public List<Balance> getCredits(Long userId) {

        return balanceRepo.findByCreditorId(userId);
    }
}