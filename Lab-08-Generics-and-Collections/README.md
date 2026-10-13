
# Lab 8: Collections and Generics

## 1. Basic Exercise — ArrayList
**File:** `ArrayListDemo.java`

Stores 10 integers in an ArrayList, calculates their sum and maximum value, and prints the list in reverse order.

## 2. Intermediate Exercise — Word Frequency
**File:** `WordFrequencyDemo.java`

Reads a paragraph, counts the frequency of each word using a Map, and displays the words in descending order of frequency.

## 3. Challenge Exercise — Generic Bubble Sort
**File:** `BubbleSortDemo.java`

Implements a generic bubble sort method using Comparable. Tests sorting with Integer and String arrays.

**Explanation:** The method cannot accept `int[]` because generics work with reference types rather than primitive types. `Integer[]` works because Integer is an object wrapper that implements Comparable.
