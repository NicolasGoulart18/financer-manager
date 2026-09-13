package br.com.nicolas.financemanager.service;

import br.com.nicolas.financemanager.model.Transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// Stores all transactions registered in the finance manager.
public class FinanceManager {
    private List<Transaction> transactions;

    public FinanceManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public void listTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public BigDecimal calculateBalance() {
        BigDecimal balance = BigDecimal.ZERO;

        for (Transaction transaction : transactions) {
            balance = balance.add(transaction.getSignedValue());
        }

        return balance;
    }
}
