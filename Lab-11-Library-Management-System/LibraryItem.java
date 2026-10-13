
public abstract class LibraryItem implements Borrowable {
    private final String id;
    private final String title;
    private boolean available = true;
    private Loan currentLoan;

    protected LibraryItem(String id, String title) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException(
                "Item ID cannot be empty."
            );
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                "Title cannot be empty."
            );
        }

        this.id = id;
        this.title = title;
    }

    public abstract int loanPeriodDays();

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void borrow(Member member)
            throws ItemNotAvailableException,
                   MemberLimitExceededException {
        if (!available) {
            throw new ItemNotAvailableException(
                "This item is already borrowed."
            );
        }

        if (member.activeLoanCount() >= 3) {
            throw new MemberLimitExceededException(
                "A member cannot have more than 3 active loans."
            );
        }

        currentLoan = new Loan(this, member);
        member.addLoan(currentLoan);
        available = false;
    }

    @Override
    public void giveBack() {
        if (currentLoan == null || currentLoan.isReturned()) {
            throw new IllegalStateException(
                "This item has no active loan."
            );
        }

        currentLoan.markReturned();
        currentLoan.getMember().removeLoan(currentLoan);
        available = true;
        currentLoan = null;
    }

    @Override
    public String toString() {
        return "ID: " + id
            + ", Title: " + title
            + ", Available: " + available;
    }
}
