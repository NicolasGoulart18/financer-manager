package br.com.nicolas.financemanager.service;
import java.util.List;

import br.com.nicolas.financemanager.model.Transaction;

import java.util.ArrayList;
public class Financemanager {
    private List<Transaction>transactions;

    public Financemanager() {
        this.transactions=new ArrayList<>();
    }
    
}
