package model;

public class User 
{
    private int id;
    private String name;
    private String password;
    private double balance;

    
    public User(int id, String name, String password) 
    {
        this.id = id;
        this.name = name;
        this.password = password;
        this.balance = 0.0;
    }

   
    public int getId() 
    { 
    	return id; 
    }
    public String getName() 
    { 
    	return name; 
    }
    public String getPassword() 
    { 
    	return password; 
    }
    public double getBalance() 
    { 
    	return balance; 
    }

    public void setBalance(double balance) 
    { 
    	this.balance = balance; 
    }

    @Override
    public String toString() 
    {
        return "UserID: " + id + " | Name: " + name + " | Balance: $" + balance;
    }
}
