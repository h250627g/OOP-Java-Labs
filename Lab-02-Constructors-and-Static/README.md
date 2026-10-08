# Lab 02: Constructors, the this Keyword and static Members

## Objective

The objective of this lab is to understand constructors, constructor overloading, constructor chaining, the `this` keyword, static members, and static factory methods in Java.

## Selected Exercises

### 1. Basic Exercise — Circle

Created a `Circle` class with:
- A constructor that accepts a radius
- A no-argument constructor that sets the radius to `1.0`
- An `area()` method

### 2. Intermediate Exercise — Employee

Created an `Employee` class with:
- An auto-incrementing employee ID using a static counter
- Three overloaded constructors
- A copy constructor
- A `display()` method

### 3. Challenge — Temperature

Created a `Temperature` class with:
- A private constructor
- A static factory method `fromCelsius()`
- A static factory method `fromFahrenheit()`
- A getter for the Celsius temperature

Static factory methods provide clear ways of creating objects from different types of input.

## Files

- `Circle.java`
- `Employee.java`
- `Temperature.java`

## Concepts Demonstrated

- Constructors
- Constructor overloading
- Constructor chaining using `this(...)`
- The `this` keyword
- Static variables
- Static methods
- Copy constructors
- Static factory methods
- Private constructors

## Conclusion

This lab provided practical experience with different types of constructors and demonstrated how static members are shared by objects of the same class. It also showed how constructor chaining and static factory methods can make object creation clearer and more organized.
