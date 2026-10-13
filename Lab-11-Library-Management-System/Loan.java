
import java.time.LocalDate;

public class Loan {
    private final LibraryItem item;
    private final Member member;
    private final LocalDate borrowDate;
    private final LocalDate dueDate;
    private LocalDate returnDate;

    public Loan(LibraryItem item, Member member) {
        this.item = item;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.dueDate = borrowDate.plusDays(
            item.loanPeriodDays()
        );
    }

    public LibraryItem getItem() {
        return item;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    public boolean isOverdue() {
        return !isReturned()
            && LocalDate.now().isAfter(dueDate);
    }

    public void markReturned() {
        returnDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return item.getTitle()
            + " borrowed by " + member.getName()
            + ", due: " + dueDate;
    }
}
