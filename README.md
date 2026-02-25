# PalindroneCheckerApp
STEP
Project: Palindrome Checker (Pointer Approach in Java)
Objective

To determine whether a given string is a palindrome using the two-pointer technique in Java.

A palindrome is a word, phrase, or sequence that reads the same forward and backward (e.g., madam, racecar, level).

Use Case

This approach is useful when:

You want an efficient solution (O(n) time complexity).

You want to avoid reversing the string.

You want to compare characters from both ends moving inward.

You may need to handle:

Case-insensitive comparisons

Ignoring spaces or special characters (optional enhancement)

Steps: Pointer Approach:

Step 1: Take Input

Get the string from the user.

Step 2: Initialize Two Pointers

i = 0 → Start of the string

j = length - 1 → End of the string

Step 3: Compare Characters

While i < j:

Compare character at left with character at right.

If they are not equal:

The string is not a palindrome.

Stop the process.

If they are equal:

Increment i++

Decrement j--