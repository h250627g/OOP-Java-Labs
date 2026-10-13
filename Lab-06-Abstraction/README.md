# Lab 06 — Abstraction and Interfaces

## Basic — Flyable Interface

Created a `Flyable` interface with a `fly()` method. Implemented it in `Bird` and `Aeroplane`, demonstrating that unrelated classes can share an interface.

**Files:** `Flyable.java`, `Bird.java`, `Aeroplane.java`, `FlyableDemo.java`

## Intermediate — Comparable and Comparator

Created a `Student` class implementing `Comparable<Student>` to sort students by name. Used a `Comparator<Student>` to sort students by marks in ascending order.

**Files:** `Student.java`, `StudentSortDemo.java`

## Challenge — Default Method Conflict

Created two interfaces with conflicting default `hello()` methods. Resolved the conflict by overriding `hello()` and explicitly calling both implementations using `InterfaceA.super.hello()` and `InterfaceB.super.hello()`.

**File:** `DefaultMethodDemo.java`

## Conclusion

This lab demonstrates interfaces, implementation, natural ordering, custom sorting, and resolving conflicting default methods in Java.


