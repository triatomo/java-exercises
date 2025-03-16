package org.example.linkedList;

public class Main {
    public static void main(String[] args) {
        // Creating the first number: 2 -> 4 -> 3 (Represents 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
//        AddTwoNumbers.printList(l1);

        // Creating the second number: 5 -> 6 -> 4 (Represents 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

//        AddTwoNumbers exercise
//        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
//        AddTwoNumbers.printList(result);
    }
}
