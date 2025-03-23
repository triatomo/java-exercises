# My first Java exercises

This repository contains my first Java exercises. Some of the exercises are from the udemy
course [Java Masterclass 2025](https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/34999832?start=15#overview)
by Tim Buchalka.

## Leetcode cheat sheet

### Sliding window

You have a list and you have to find certain range within that list that fulfills certain criteria.
Example: substring from a string that doesn't contain repeating characters.

#### Components

- A `set` to store the characters. Example:
  ```Set<Character> charSet = new HashSet<>();```
- Pointer `left ` that points to the start of the window
- Pointer `right` that points to the end of the window


#### Approach
Think what the main purpose of the iteration is. For example, the problem of finding the longest substring is to keep
making the window bigger. In this case, moving pointer `right` might be the main purpose. That is the positive case. 
Think about what happens if the positive condition is not fulfilled. The negative condition should be inside an interation or and if clause inside that for loop.

### ListNode

ListNode class is a recursive class that represents a single node in a linked list.
#### Components
- The `val` field is an integer which represents the value stored in the node,
- The `next` field is a pointer to the next node in the list. This is the recursion part.

#### Add new node
```
ListNode newNode = new ListNode(val); // Create a new node
tail.next = newNode; // Add the new node by pointing the existing node (tail) to the new node
```
#### Set the current node to the next node
```aiignore
current = current.next;
ListNode result = dummyHead.next; // Move the result to the next node of the dummyHead
```