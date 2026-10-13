# Lab 07 — Exception Handling

## Basic — Division and Exception Handling

Created a program that reads two integers using `Scanner` and performs division. Handled non-numeric input using `InputMismatchException` and division by zero using `ArithmeticException`.

**File:** `DivisionDemo.java`

## Intermediate — Custom Exception

Created `InsufficientFundsException` and modified `BankAccount.withdraw()` to throw the exception when the requested withdrawal exceeds the available balance.

**Files:** `InsufficientFundsException.java`, `BankAccount.java`, `BankAccountDemo.java`

**Trade-offs:** Throwing an exception makes errors explicit and provides a detailed message, but requires additional exception-handling code. Returning `false` is simpler for expected failures but provides less information unless additional details are supplied.

## Challenge — Return and Finally

Created a method that returns a value inside a `try` block and prints a message inside `finally`. The `finally` block executes before the method returns.

**File:** `FinallyDemo.java`

## Conclusion

This lab demonstrates exception handling, custom checked exceptions, and the execution of `finally` during a return operation.
