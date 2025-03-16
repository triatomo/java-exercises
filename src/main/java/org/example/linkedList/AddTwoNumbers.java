package org.example.linkedList;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l1 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0; //Get the value of node 1 in l1. 1st iteration: 2. 2nd iteration: 4. 3rd iteration: 3
            int digit2 = (l2 != null) ? l2.val : 0; //Get the value of node 1 in l2. 1st iteration: 5. 2nd iteration: 6. 3rd iteration: 4

            int sum = digit1 + digit2 + carry; // 1st iteration: 2 + 5 + 0 = 7. 2nd iteration: 4 + 6 + 0 = 10. 3rd iteration: 3 + 4 + 1 = 8
            int digit = sum % 10; // 7 % 10 = 7. 10 % 10 = 0. 8 % 10 = 8
            carry = sum / 10; // 7 / 10 = 0. 10 / 10 = 1. 8 / 10 = 0

            ListNode newNode = new ListNode(digit); // 1st iteration: Create a new node with value 7. 2nd iteration: Create a new node with value 0. 3rd iteration: Create a new node with value 8
            tail.next = newNode; // Add the new node to the end of the list by making the tail pointing at the new node
            tail = tail.next; // Move the tail to the new node. 1st iteration: tail = 7. 2nd iteration: tail = 0. 3rd iteration: tail = 8


            l1 = (l1 != null) ? l1.next : null; // Move to the next node in l1
            l2 = (l2 != null) ? l2.next : null; // Move to the next node in l2
        }
        ListNode result = dummyHead.next; // Move the result to the next node of the dummyHead
        dummyHead.next = null;
        return result;
    }

    // Utility method to print a linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
