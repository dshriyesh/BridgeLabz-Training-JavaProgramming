package com.splitwise.splitwiselite.repository;

import com.splitwise.splitwiselite.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BalanceRepository
        extends JpaRepository<Balance, Long> {

    List<Balance> findByDebtorId(Long debtorId);

    List<Balance> findByCreditorId(Long creditorId);

}