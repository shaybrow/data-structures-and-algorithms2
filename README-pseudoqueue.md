# Challenge Summary
Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.

## Challenge Description
<!-- Description of the challenge -->

## Approach & Efficiency
We need to iterate through the back stack only when the front stack is empty. Because we are only storing a primitive space should be O(1)

## Solution
- !()[assets/PsuedoQueue.png]