
# Lab 11: Library Management System

## Project Overview
This mini-project is a Java-based Library Management System. It manages books, DVDs, library members, and borrowing activities.

## Features
- Add books and DVDs.
- Register library members.
- Borrow and return items.
- Limit each member to three active loans.
- Display overdue items.
- Search for items by title using Java Streams.
- Save and reload library data using CSV files.
- Handle unavailable items and borrowing-limit errors.

## Classes
- `LibraryItem`: Abstract parent class for library items.
- `Book`: Represents a book with a 14-day loan period.
- `Dvd`: Represents a DVD with a 7-day loan period.
- `Borrowable`: Interface for borrowing and returning items.
- `Member`: Stores member details and active loans.
- `Loan`: Stores borrowing dates, due dates, and return dates.
- `Library`: Manages items, members, and loans.
- `LibraryFileManager`: Saves and loads CSV data.
- `LibraryApp`: Runs the menu-driven application.
- `ItemNotAvailableException`: Handles unavailable items.
- `MemberLimitExceededException`: Handles borrowing-limit violations.

## Data Persistence
The application uses three CSV files:
- `items.csv`
- `members.csv`
- `loans.csv`

## Technologies
- Java
- Object-oriented programming
- Collections and Maps
- Interfaces and abstract classes
- Exception handling
- Java Streams
- File handling and CSV persistence

## Student Details
- Name: Tanatswa Definite Muvezwa
- Registration Number: H250627G
- Department: Software Engineering

