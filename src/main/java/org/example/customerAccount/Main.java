package org.example.customerAccount;

public class Main {
    public static void main(String[] args) {
        Customer tria = new Customer();
        Customer bob = new Customer("Bob", "bob@gmail.com");
        Customer tim = new Customer("Tim", 798.96, "tim@gmail.com");

        System.out.println(tria);
        System.out.println(bob);
        System.out.println(tim);

    }
}
