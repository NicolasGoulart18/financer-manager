package br.com.nicolas.financemanager;
import br.com.nicolas.financemanager.model.TransactionType;
import br.com.nicolas.financemanager.model.Transaction;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Transaction salary= new Transaction("salario", new BigDecimal(2500), TransactionType.INCOME);
        Transaction netflix = new Transaction("netflix", new BigDecimal("50.00"), TransactionType.EXPENSE);
        System.out.println(salary.getDescription());
        System.out.println(salary.getValue());
        System.out.println(salary.getType());
        System.out.println(salary.isExpense());
        System.out.println(netflix.getSignedValue());
        System.out.println(netflix);
        
    }
}
