# Challenge Summary

Create a first in first out Animal shelter the lets adoptees pick whether they get a cat or dog

## Challenge Description

Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
Implement the following methods:
enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

## Approach & Efficiency

I used separate queues to store each type of animal. This cost extra memory but saved time from not needing to iterate and conditionally check for animal type.

## Solution

- !()[assets/AnimalShelter.png]

- [code](challenges/lib/src/main/java/challenges/stacksandqueues/animalshelter/AnimalShelter.java)
