# ListNode

ListNode class is a recursive class that represents a single node in a linked list.
It has two fields: val and next.
- The `val` field is an integer which represents the value stored in the node,
- The `next` field is a pointer to the next node in the list. This is the recursion part.

### Adding new node

```
ListNode newNode = new ListNode(val); // Create a new node
tail.next = newNode; // Add the new node by pointing the existing node (tail) to the new node
```
### Setting the end of the list to the new node
```aiignore
tail = tail.next;
```

# Solution to add two numbers from two linked lists in reverse order

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```

We don't reverse the linked lists l1 and l2, i.e we work through the linked lists they way they are. We use the integer
`carry`that carries the first number if the sum is greater than 9 and add it to the next node in the loop. 
