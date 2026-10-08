# Lab 03 — Encapsulation and Access Modifiers

## Objective

To understand encapsulation by hiding internal data, controlling access using access modifiers, validating data, and protecting internal object state.

## Selected Exercises

### 1. Basic — Student
Created a `Student` class with private `name` and `marks` fields. The marks setter validates that marks are between 0 and 100.

### 2. Intermediate — BankAccount
Created a `BankAccount` class with transaction history using a list. The getter returns an unmodifiable copy so outside code cannot directly change the internal transaction history.

### 3. Challenge — Temperature
Created a `Temperature` class that stores temperature internally in Kelvin and provides Celsius and Fahrenheit getters. Temperatures below absolute zero are rejected.

## Files

- `Student.java`
- `BankAccount.java`
- `Temperature.java`

## Concepts Demonstrated

- Encapsulation
- Private fields
- Getters and setters
- Data validation
- Access modifiers
- `ArrayList` and `List`
- Unmodifiable collections
- Protecting internal object state
- Exception handling for invalid data

## Conclusion

Lab 03 demonstrated how encapsulation protects an object's internal data and allows controlled access through methods. Validation and unmodifiable collections were also used to maintain valid and protected object state.
