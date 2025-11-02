package model;

import java.time.LocalDateTime;

public class Transaction {
    private int userId;
    private String type;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(int userId, String type, double amount) {
        this.userId = userId;
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public int getUserId() 
    { 
    	return userId; 
    }
    public String getType() 
    { 
    	return type; 
    }
    public double getAmount() 
    { 
    	return amount; 
    }
    public LocalDateTime getDateTime() 
    { 
    	return dateTime; 
    }

    @Override
    public String toString() {
        return dateTime + " | " + type + " | $" + amount;
    }
}
