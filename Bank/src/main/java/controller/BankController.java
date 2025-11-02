package controller;

import dao.BankDAO;
import dao.BankDAOImpl;
import model.User;
import java.util.List;
import model.Transaction;

public class BankController {
    private BankDAO dao = new BankDAOImpl();

    public User register(String name, String password) 
    {
        return dao.register(name, password);
    }

    public User login(String name, String password) 
    {
        return dao.login(name, password);
    }

    public void deposit(User user, double amount) 
    {
        dao.deposit(user, amount);
    }

    public boolean withdraw(User user, double amount) 
    {
        return dao.withdraw(user, amount);
    }

    public double checkBalance(User user) 
    {
        return dao.checkBalance(user);
    }

    public List<Transaction> getTransactions(User user) 
    {
        return dao.getTransactions(user);
    }
}
