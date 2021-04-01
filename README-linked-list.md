# Linked List

## Organization

### Linked List Class

- public boolean includes checks for a value

- public String toString prints the LL out as a string

- addNode adds a node at the start of the LL

- setDoubleLinkedList assigns previous navigation and tail

- findKthFromTheEnd finds the Kth place from the end with tail =0 

- Insertbefore inserts a new node before the indicated

- InsertAfter inserts a new node after the indicated value

- Append adds a node to the tail

- zipList combines two LL into 1


### Node Class

- constructor takes in a str and a next or just a str or a str and next and prev

## Challenge Description

- .append(value) which adds a new node with the given value to the end of the list

- .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node

- .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node

- Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

- Write a function called zipLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Approach & Efficiency

I used iterative solutions for this problem. This should be log(n)

## Solution

!()[assets/ExtendedLinkList.png]
!()[assets/LinkedListKthFromEnd.png]
!()[assets/ZipLists.png]
