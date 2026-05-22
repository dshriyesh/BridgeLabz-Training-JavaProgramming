package com.splitwise.splitwiselite.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Map;

@Data
public class ExpenseRequest {

    private String description;

    private BigDecimal amount;

    private Long paidById;

    private Long groupId;

    private String splitType;

    private Map<Long, BigDecimal> percentages;
}