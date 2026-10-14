
# Library Management System — Project Report

## 1. Introduction
The Library Management System is a Java application designed to manage library items, registered members, and borrowing activities. It provides a simple menu-driven interface for performing common library operations.

## 2. System Design and Implementation
The system uses object-oriented programming principles, including encapsulation, inheritance, abstraction, and polymorphism. The abstract `LibraryItem` class is extended by `Book` and `Dvd`. The `Borrowable` interface defines borrowing and returning operations.

The `Member` class stores member information, while the `Loan` class records borrowing dates, due dates, and return dates. The `Library` class manages items, members, and loans using Maps and Lists.

Custom exceptions handle unavailable items and attempts to exceed the maximum of three active loans per member.

## 3. Main Features
The application allows users to add books and DVDs, register members, borrow and return items, list overdue loans, search for items by title, and list all items. Java Streams are used for title searches and overdue-item filtering.

## 4. Data Persistence
The system uses CSV files to save and reload library items, members, and loan records. This allows information to be retained when the application is closed and restarted.

## 5. Conclusion
The project demonstrates how Java object-oriented programming, collections, exception handling, streams, and file handling can be combined to build a basic Library Management System. The application provides a foundation for more advanced library management features.
