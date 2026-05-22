package com.splitwise.splitwiselite.service;

import com.splitwise.splitwiselite.dto.ExpenseRequest;
import com.splitwise.splitwiselite.model.Balance;
import com.splitwise.splitwiselite.model.Expense;
import com.splitwise.splitwiselite.repository.BalanceRepository;
import com.splitwise.splitwiselite.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor

public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final BalanceRepository balanceRepository;

    public String addExpense(
            ExpenseRequest request){

        if(request.getAmount()
                .compareTo(BigDecimal.ZERO)<=0){

            throw new RuntimeException(
                    "Expense cannot be negative");
        }

        Expense expense=new Expense();

        expense.setDescription(
                request.getDescription());

        expense.setAmount(
                request.getAmount());

        expense.setPaidById(
                request.getPaidById());

        expense.setGroupId(
                request.getGroupId());

        expense.setSplitType(
                Expense.SplitType.valueOf(
                        request.getSplitType()
                ));

        expenseRepository.save(expense);

        calculateBalances(request);

        return "Expense added";
    }

    private void calculateBalances(
            ExpenseRequest request){

        BigDecimal amount=
                request.getAmount();

        Long payer=
                request.getPaidById();

        if(request.getSplitType()
                .equals("EQUAL")){

            int size=
                    request.getPercentages()
                            .size();

            BigDecimal share=
                    amount.divide(
                            BigDecimal.valueOf(size));

            for(Long user:
                    request.getPercentages()
                            .keySet()){

                Balance b=
                        new Balance();

                b.setDebtorId(user);

                b.setCreditorId(payer);

                b.setAmount(share);

                balanceRepository.save(b);
            }
        }

        else{

            request.getPercentages()
                    .forEach((user,percent)->{

                        BigDecimal owe=
                                amount.multiply(percent)
                                        .divide(
                                                BigDecimal.valueOf(100)
                                        );

                        Balance b=
                                new Balance();

                        b.setDebtorId(user);

                        b.setCreditorId(payer);

                        b.setAmount(owe);

                        balanceRepository.save(b);

                    });

        }
    }
}