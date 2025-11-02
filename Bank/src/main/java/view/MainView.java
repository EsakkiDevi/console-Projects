package view;

import controller.BankController;
import model.User;
import java.util.Scanner;

public class MainView {
   public void MainViewOfBank() {
        BankController controller = new BankController();
        Scanner sc = new Scanner(System.in);
        User currentUser = null;

        while (true) 
        {
            if (currentUser == null) 
            {
                System.out.println("\n=== BANKING SYSTEM ===");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt(); sc.nextLine();

                switch (ch) 
                {
                    case 1:
                        System.out.print("Enter username: ");
                        String name = sc.nextLine();
                        System.out.print("Enter password: ");
                        String pass = sc.nextLine();
                        currentUser = controller.register(name, pass);
                        if (currentUser != null)
                            System.out.println("Registered successfully! Logged in as " + currentUser.getName());
                        break;
                    case 2:
                        System.out.print("Enter username: ");
                        name = sc.nextLine();
                        System.out.print("Enter password: ");
                        pass = sc.nextLine();
                        currentUser = controller.login(name, pass);
                        if (currentUser == null)
                            System.out.println("Invalid username or password!");
                        else
                            System.out.println("Welcome back, " + currentUser.getName());
                        break;
                    case 3:
                        System.out.println("Thank you for using the Banking System!");
                        System.exit(0);
                }
            } 
            else 
            {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Transaction History");
                System.out.println("5. Logout");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                switch (ch) 
                {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        controller.deposit(currentUser, dep);
                        System.out.println("Deposited $" + dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        if (controller.withdraw(currentUser, wd))
                            System.out.println("Withdrawn $" + wd);
                        else
                            System.out.println("Insufficient balance!");
                        break;
                    case 3:
                        System.out.println("Current Balance: $" + controller.checkBalance(currentUser));
                        break;
                    case 4:
                        System.out.println("Transaction History:");
                        controller.getTransactions(currentUser).forEach(System.out::println);
                        break;
                    case 5:
                        currentUser = null;
                        System.out.println("Logged out successfully.");
                        break;
                }
            }
        }
    }
}
