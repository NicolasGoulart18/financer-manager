package br.com.nicolas.financemanager.model;

import java.math.BigDecimal;

public class Transaction {
    private String description;
    private BigDecimal value;
    private TransactionType type;
    public Transaction(String description, BigDecimal value, TransactionType type) {
        this.description = description;
        this.value = value;
        this.type = type;
    }

    
}
