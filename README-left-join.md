# Challenge Summary

Take in 2 Hashmaps and return a list of lists with each list containing a key and value from the left Hashmap and the value from the same key if it exists in the right Hashmap.

## Challenge Description

Write a function that LEFT JOINs two hashmaps into a single data structure.
The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
Avoid utilizing any of the library methods available to your language.

## Approach & Efficiency

- Time: O(n^2) because we are performing a nested loop based on the size of the left Hashmap time grows exponentially

- Space: O(n) because we are provisioning storage space for a list the size of the left hashmap up to + 1

## Solution

![](assets/LeftJoin.jpg)

- [code](challenges/lib/src/main/java/challenges/LeftJoin/LeftJoin.java)