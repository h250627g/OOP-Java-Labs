
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private final Map<String, LibraryItem> items = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();
    private final List<Loan> loans = new ArrayList<>();

    public void addItem(LibraryItem item) {
        if (items.containsKey(item.getId())) {
            throw new IllegalArgumentException("Item ID already exists.");
        }
        items.put(item.getId(), item);
    }

    public void registerMember(Member member) {
        if (members.containsKey(member.getId())) {
            throw new IllegalArgumentException("Member ID already exists.");
        }
        members.put(member.getId(), member);
    }

    public Map<String, LibraryItem> getItems() {
        return Map.copyOf(items);
    }

    public Map<String, Member> getMembers() {
        return Map.copyOf(members);
    }

    public List<Loan> getLoans() {
        return List.copyOf(loans);
    }

    public void borrow(String memberId, String itemId)
            throws ItemNotAvailableException,
                   MemberLimitExceededException {
        Member member = members.get(memberId);
        LibraryItem item = items.get(itemId);

        if (member == null || item == null) {
            throw new IllegalArgumentException(
                "Member or item was not found."
            );
        }

        if (!item.isAvailable()) {
            throw new ItemNotAvailableException(
                "This item is already borrowed."
            );
        }

        if (member.activeLoanCount() >= 3) {
            throw new MemberLimitExceededException(
                "A member cannot have more than 3 active loans."
            );
        }

        Loan loan = new Loan(item, member);
        item.setAvailable(false);
        member.addLoan(loan);
        loans.add(loan);
    }

    public void giveBack(String itemId) {
        LibraryItem item = items.get(itemId);

        if (item == null) {
            throw new IllegalArgumentException("Item was not found.");
        }

        Loan loan = loans.stream()
            .filter(l -> l.getItem().getId().equals(itemId))
            .filter(l -> !l.isReturned())
            .findFirst()
            .orElseThrow(() ->
                new IllegalArgumentException("No active loan found.")
            );

        loan.markReturned();
        loan.getMember().removeLoan(loan);
        item.setAvailable(true);
    }

    public List<Loan> listOverdueItems() {
        return loans.stream()
            .filter(Loan::isOverdue)
            .sorted(Comparator.comparing(Loan::getDueDate))
            .toList();
    }

    public List<LibraryItem> searchByTitle(String text) {
        String query = text.toLowerCase();

        return items.values().stream()
            .filter(item -> item.getTitle()
                .toLowerCase().contains(query))
            .sorted(Comparator.comparing(LibraryItem::getTitle))
            .toList();
    }
}
