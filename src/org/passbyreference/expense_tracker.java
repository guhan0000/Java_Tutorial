package org.passbyreference;

import java.io.*;
import java.util.*;

class Transaction implements Serializable {
    private String type; // "Income" or "Expense"
    private double amount;
    private String category;
    private Date date;

    public Transaction(String type, double amount, String category) {
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.date = new Date(); // Current date/time
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return type + " of $" + amount + " for " + category + " on " + date;
    }
}

class ExpenseTracker {
    private List<Transaction> transactions;
    private double balance;

    public ExpenseTracker() {
        transactions = new ArrayList<>();
        balance = 0;
    }

    public void addTransaction(String type, double amount, String category) {
        Transaction transaction = new Transaction(type, amount, category);
        transactions.add(transaction);
        if (type.equalsIgnoreCase("Income")) {
            balance += amount;
        } else if (type.equalsIgnoreCase("Expense")) {
            balance -= amount;
        }
    }

    public void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }

    public void viewBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(transactions);
            oos.writeDouble(balance);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

            
            transactions = (List<Transaction>) ois.readObject();
            balance = ois.readDouble();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}

public class expense_tracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker tracker = new ExpenseTracker();
        String filename = "expenses.dat";

        // Load existing data if available
        tracker.loadFromFile(filename);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. View Balance");
            System.out.println("5. Save & Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter income amount: ");
                    double income = scanner.nextDouble();
                    System.out.print("Enter category: ");
                    String incomeCategory = scanner.next();
                    tracker.addTransaction("Income", income, incomeCategory);
                    break;
                case 2:
                    System.out.print("Enter expense amount: ");
                    double expense = scanner.nextDouble();
                    System.out.print("Enter category: ");
                    String expenseCategory = scanner.next();
                    tracker.addTransaction("Expense", expense, expenseCategory);
                    break;
                case 3:
                    tracker.viewTransactions();
                    break;
                case 4:
                    tracker.viewBalance();
                    break;
                case 5:
                    tracker.saveToFile(filename);
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
