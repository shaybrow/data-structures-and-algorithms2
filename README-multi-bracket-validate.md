# Challenge Summary

Confirms whther brackets are opened and closed correctly in a string

## Challenge Description

Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}
Example

## Approach & Efficiency

I used a stack to store recent opening brackets and check logic. This kept order efficiently and prevented reverse iterating or additional variables to store previous.

## Solution

- !()[assets/multiBracketValidate.jpg]

- [code](challenges/lib/src/main/java/challenges/stacksandqueues/MainFile.java)