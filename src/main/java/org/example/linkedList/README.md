# Solution to add two numbers from two linked lists in reverse order

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```
We don't reverse the linked lists l1 and l2, i.e we work through the linked lists they way they are. We use the integer
`carry`that carries the first number if the sum is greater than 9 and add it to the next node in the loop. 
