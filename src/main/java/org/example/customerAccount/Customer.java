package org.example.customerAccount;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
//        System.out.println(getName() + "'s account has limit of " + getCreditLimit());
    }

    public Customer() {
        this("Tria", 1000.50, "restria@gmail.com");
        System.out.println("This is the second constructor");
    }

    public Customer(String name, String emailAddress) {
        this(name, 90.50, emailAddress);
        this.name = name;
        this.emailAddress = emailAddress;
        System.out.println("Calling the last constructor");
    }

    public void getCustomCreditLimit(Customer cst) {
        System.out.println(cst.getCreditLimit());
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
//    public static void main(String[] args) {
//        Customer cst = new Customer("Ben", 175, "ben@gmail.com");
////        Customer tria = new Customer();
//        cst.getCustomCreditLimit(cst);
//    }
}
