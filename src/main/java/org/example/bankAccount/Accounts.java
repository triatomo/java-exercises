package org.example.bankAccount;

public class Accounts {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double amount) {
        accountBalance += amount;
        System.out.println("Deposit of $" + amount + ". New balance: $" + accountBalance);
    }
    public void withdrawFund(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient balance! Your balance is " + accountBalance);
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " processed. Remaining balance: $" + accountBalance);
        }
    }
}
