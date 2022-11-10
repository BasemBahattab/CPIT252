package edu.kau.fcit.cpit252.transactions;

import java.util.Scanner;

public class Transfer extends Transaction {

    private String accountNumber;
    private double amount;

    public Transfer(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public  boolean transferTransaction(User user) {
        // 1. send a one-time-password (OTP)
        sendOTP(user.getEmail());
        // 2. validate the OTP
        if (validateOTP(user.getEmail())) {
            // 3. Show a confirmation dialog
            if (showDialog()) {
                // 4. Perform/execute the transaction
                boolean result = perform(user);
                // 5. Show the close dialog
                closeDialog();
                // 6. Return the status of executing the transaction
                return result;
            }
        }
        return false;
    }
    public boolean showDialog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Transferring money? (y|n) ");
        String answer = scanner.next();
        if (answer.contains("y")) {
            return true;
        }
        return false;
    }

    public boolean perform(User u) {
        simulateNetworkLatency();
        System.out.println("Transferring: SAR " + this.amount + " was sent to " + this.accountNumber);
        return true;
    }

    
    public void closeDialog() {
        System.out.println("Closing the Transfer dialog.");
    }
}