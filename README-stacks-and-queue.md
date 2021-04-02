# Stacks and Queues
This is my personal implementation of Stacks and Queues data structures.

## Challenge

### Implementation

#### Stacks

Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
Should raise exception when called on empty stack
Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
Should raise exception when called on empty stack
Define a method called isEmpty that takes no argument, and returns a boolean indicating whether or not the stack is empty.

#### Queues 

Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
Should raise exception when called on empty queue
Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
Should raise exception when called on empty queue
Define a method called isEmpty that takes no argument, and returns a boolean indicating whether or not the queue is empty.

## Approach & Efficiency

I approached all methods from the implementation challenge aiming to keep them as constant as possible. This lead to me creating the back property for queue and the prev property for node This allowed all methods to be O(1) for space and O(1) for time.

## API

### Stack

- push takes in an input and adds a node with that input to the top of the stack

- pop removes and returns the top value in the stack and throws an exception if the stack is empty

- peek returns the top value from the stack without removing and throws an exception if empty

- isEmpty returns a boolean confirming whther or not the stack is empty

### Queue

- enqueue takes in an input and creates a new node at the back of the queue

- dequeue removes the node from the front of the queue and returns it. Throws an exception is queue is empty

- peek returns the value at the front of the queue and throws an exception if the queue is empty

- isEmpty returns a boolean confirming whether or not the queue is empty