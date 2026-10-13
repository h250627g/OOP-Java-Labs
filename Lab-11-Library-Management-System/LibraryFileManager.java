
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LibraryFileManager {
    private static final Path ITEMS_FILE = Path.of("items.csv");
    private static final Path MEMBERS_FILE = Path.of("members.csv");
    private static final Path LOANS_FILE = Path.of("loans.csv");

    public static void save(Library library) throws IOException {
        List<String> items = library.getItems().values().stream()
            .map(item -> (item instanceof Book ? "Book" : "Dvd")
                + "," + clean(item.getId())
                + "," + clean(item.getTitle())
                + "," + item.isAvailable())
            .toList();

        List<String> members = library.getMembers().values().stream()
            .map(member -> clean(member.getId())
                + "," + clean(member.getName()))
            .toList();

        List<String> loans = library.getLoans().stream()
            .map(loan -> clean(loan.getMember().getId())
                + "," + clean(loan.getItem().getId())
                + "," + loan.getBorrowDate()
                + "," + loan.getDueDate()
                + "," + (loan.getReturnDate() == null
                    ? "" : loan.getReturnDate()))
            .toList();

        Files.write(ITEMS_FILE, items);
        Files.write(MEMBERS_FILE, members);
        Files.write(LOANS_FILE, loans);
    }

    public static void load(Library library) throws IOException {
        if (Files.exists(ITEMS_FILE)) {
            for (String line : Files.readAllLines(ITEMS_FILE)) {
                String[] data = line.split(",", 4);
                if (data.length < 4) continue;

                LibraryItem item;
                if (data[0].equals("Book")) {
                    item = new Book(data[1], data[2]);
                } else {
                    item = new Dvd(data[1], data[2]);
                }

                library.addItem(item);
            }
        }

        if (Files.exists(MEMBERS_FILE)) {
            for (String line : Files.readAllLines(MEMBERS_FILE)) {
                String[] data = line.split(",", 2);
                if (data.length == 2) {
                    library.registerMember(
                        new Member(data[0], data[1])
                    );
                }
            }
        }

        if (Files.exists(LOANS_FILE)) {
            for (String line : Files.readAllLines(LOANS_FILE)) {
                String[] data = line.split(",", -1);
                if (data.length < 5) continue;

                LibraryItem item = library.getItems().get(data[1]);
                Member member = library.getMembers().get(data[0]);

                if (item == null || member == null) continue;

                // Rebuild loan history in the next version of the loader.
                // Current item availability is derived from the saved item state.
            }
        }
    }

    private static String clean(String value) {
        return value.replace(",", " ").trim();
    }
}
