package com.splitwise.splitwiselite.repository;

import com.splitwise.splitwiselite.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository
        extends JpaRepository<Expense, Long> {

    List<Expense> findByGroupId(Long groupId);

    List<Expense> findByPaidById(Long userId);

}