package dao;

import model.User;
import model.Transaction;
import java.util.List;

public class BankDAOImpl implements BankDAO {
    private DataStore db = DataStore.getInstance();

    @Override
    public User register(String name, String password) {
        User existing = db.getUserByName(name);
        if (existing != null) {
            System.out.println("User already exists!");
            return null;
        }
        return db.addUser(name, password);
    }

    @Override
    public User login(String name, String password) {
        User user = db.getUserByName(name);
        if (user != null && user.getPassword().equals(password))
            return user;
        return null;
    }

    @Override
    public void deposit(User user, double amount) {
        user.setBalance(user.getBalance() + amount);
        db.addTransaction(new Transaction(user.getId(), "Deposit", amount));
    }

    @Override
    public boolean withdraw(User user, double amount) {
        if (user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            db.addTransaction(new Transaction(user.getId(), "Withdraw", amount));
            return true;
        }
        return false;
    }

    @Override
    public double checkBalance(User user) {
        return user.getBalance();
    }

    @Override
    public List<Transaction> getTransactions(User user) {
        return db.getTransactionsByUserId(user.getId());
    }
}
