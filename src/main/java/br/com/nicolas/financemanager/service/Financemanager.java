package br.com.nicolas.financemanager.service;
import java.util.List;

import br.com.nicolas.financemanager.model.Transaction;
import br.com.nicolas.financemanager.model.TransactionType;

import java.math.BigDecimal;
import java.util.ArrayList;
// aq vamos usar ArrayList e List para armazenar as transações.Ela elimina a necessidade de deixar cada transação guardada em uma variável solta no Main; o FinanceManager centraliza todas dentro da lista.
public class FinanceManager {
    private List<Transaction>transactions;

    public FinanceManager() {
        this.transactions=new ArrayList<>();
    }
    
    public void addTransaction(Transaction transactions){
        this.transactions.add(transactions);
    }

    public void listTransactions(){
        for(Transaction transaction:transactions){
            System.out.println(transaction);
        }
    }

    public BigDecimal calculateBalance(){
        BigDecimal balance = BigDecimal.ZERO;
        for (Transaction transaction : transactions) {
                balance = balance.add(transaction.getSignedValue());
            }
        return balance;
    }

}
