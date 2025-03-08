package org.example.bankAccount;

public class Main {
    public static void main(String[] args) {
        Accounts account = new Accounts();
        account.setCustomerName("Tria");
        System.out.println("Account owner: " + account.getCustomerName());
        account.depositFund(500);
        account.withdrawFund(25);
        account.depositFund(100);
        account.withdrawFund(400);
        account.withdrawFund(350);
    }

}
