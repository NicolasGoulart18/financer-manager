package br.com.nicolas.financemanager;
import br.com.nicolas.financemanager.model.TransactionType;
import br.com.nicolas.financemanager.service.FinanceManager;
import br.com.nicolas.financemanager.model.Transaction;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        FinanceManager manager=new FinanceManager();
        Transaction salary= new Transaction("Salario", new BigDecimal("2500.00"), TransactionType.INCOME);
        Transaction netflix = new Transaction("Netflix", new BigDecimal("50.00"), TransactionType.EXPENSE);
        manager.addTransaction(salary);
        manager.addTransaction(netflix);
        manager.listTransactions();
    }
}
