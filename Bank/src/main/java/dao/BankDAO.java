package dao;

import model.User;
import model.Transaction;
import java.util.List;

public interface BankDAO 
{
    User register(String name, String password);
    User login(String name, String password);
    void deposit(User user, double amount);
    boolean withdraw(User user, double amount);
    double checkBalance(User user);
    List<Transaction> getTransactions(User user);
}
