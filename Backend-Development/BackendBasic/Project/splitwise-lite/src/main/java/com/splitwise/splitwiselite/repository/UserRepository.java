package com.splitwise.splitwiselite.repository;

import com.splitwise.splitwiselite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
}