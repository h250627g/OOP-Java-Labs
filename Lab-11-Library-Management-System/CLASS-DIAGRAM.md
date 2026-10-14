
# Library Management System — Class Diagram

```mermaid
classDiagram
    class Borrowable {
        <<interface>>
        +borrow(Member member)
        +giveBack()
    }

    class LibraryItem {
        <<abstract>>
        -String id
        -String title
        -boolean available
        -Loan currentLoan
        +loanPeriodDays()*
        +borrow(Member member)
        +giveBack()
    }

    class Book {
        +loanPeriodDays() int
    }

    class Dvd {
        +loanPeriodDays() int
    }

    class Member {
        -String id
        -String name
        -List~Loan~ loans
        +activeLoanCount() int
    }

    class Loan {
        -LocalDate borrowDate
        -LocalDate dueDate
        -LocalDate returnDate
        +isOverdue() boolean
        +markReturned()
    }

    class Library {
        -Map~String, LibraryItem~ items
        -Map~String, Member~ members
        -List~Loan~ loans
        +addItem(LibraryItem item)
        +registerMember(Member member)
        +borrow(String memberId, String itemId)
        +giveBack(String itemId)
        +listOverdueItems()
        +searchByTitle(String text)
    }

    class LibraryFileManager {
        +save(Library library)
        +load(Library library)
    }

    class LibraryApp {
        +main(String[] args)
    }

    class ItemNotAvailableException
    class MemberLimitExceededException

    Borrowable <|.. LibraryItem
    LibraryItem <|-- Book
    LibraryItem <|-- Dvd
    LibraryItem --> Loan
    Loan --> Member
    Loan --> LibraryItem
    Library o-- LibraryItem
    Library o-- Member
    Library o-- Loan
    LibraryFileManager ..> Library
    LibraryApp ..> Library
    LibraryItem ..> ItemNotAvailableException
    LibraryItem ..> MemberLimitExceededException
```
