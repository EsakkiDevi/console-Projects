package dao;

import java.util.*;
import model.User;
import model.Transaction;

public class DataStore {
    private static DataStore instance; 

    private HashMap<Integer, User> users = new HashMap<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private int userIdCounter = 1;

    private DataStore() {}  // Private constructor

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

        public User addUser(String name, String password) 
        {
        User user = new User(userIdCounter++, name, password);
        users.put(user.getId(), user);
        return user;
        }

    public Collection<User> getAllUsers() {
        return users.values();
    }

    public User getUserByName(String name) {
        for (User user : users.values()) 
        {
            if (user.getName().equalsIgnoreCase(name))
                return user;
        }
        return null;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> getTransactionsByUserId(int id) {
        ArrayList<Transaction> list = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getUserId() == id) 
            {
                list.add(t);
            }
        }
        return list;
    }
}
