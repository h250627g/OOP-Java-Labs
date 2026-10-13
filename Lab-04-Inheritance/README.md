# Lab 04 — Inheritance

## Objective

To understand inheritance in Java by creating a parent class and a child class.

## Selected Exercise

### Basic — Person and Student

Created a `Person` parent class containing `name` and `age`. Created a `Student` subclass that inherits from `Person` and adds a `course` field.

## Files

- `Person.java`
- `Student.java`
- `InheritanceDemo.java`

## Concepts Demonstrated

- Inheritance using `extends`
- Parent constructors using `super`
- Method overriding using `@Override`
- Reusing inherited methods

  ### Intermediate — Multilevel Inheritance

Created a `Vehicle` parent class, a `Car` subclass, and an `ElectricCar` subclass. Used constructor messages to demonstrate the order of constructor calls when an `ElectricCar` object is created.

## Additional Files

- `Vehicle.java`
- `Car.java`
- `ElectricCar.java`
- `VehicleDemo.java`

  ### Challenge — Stack Using Composition

Created a `Stack` class that contains an `ArrayList` instead of extending `ArrayList`.

The stack provides `push()`, `pop()`, `peek()`, and `isEmpty()` methods.

**Why composition is better:** If `Stack` extends `ArrayList`, it exposes list methods such as `add()`, `remove(index)`, and `clear()`. These methods allow users to manipulate elements in ways that violate the Last-In, First-Out (LIFO) principle. Composition hides these unwanted operations and provides better control over the stack.

## Conclusion

This exercise demonstrates how a child class inherits data and behaviour from a parent class and can extend or override that behaviour.
