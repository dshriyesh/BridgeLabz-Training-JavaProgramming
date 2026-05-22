package com.splitwise.splitwiselite.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Expense {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;

    private String description;

    private BigDecimal amount;

    private Long paidById;

    private Long groupId;

    @Enumerated(EnumType.STRING)
    private SplitType splitType;

    public enum SplitType {
        EQUAL,
        PERCENTAGE
    }
}