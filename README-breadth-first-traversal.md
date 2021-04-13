# Challenge Summary

Take a binary tree and return a list of all values starting from the root down, left to right

## Challenge Description

Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.

## Approach & Efficiency

I used a recursive, in order traversal of the tree to determine the max value. This should be O(n) for time. Space is returning a list and we are not holding anything so this should be O(1)

## Solution

- !()[assets/BreadthFirstTraversal.jpg]

- [code](challenges/lib/src/main/java/challenges/tree/BinaryTree.java)