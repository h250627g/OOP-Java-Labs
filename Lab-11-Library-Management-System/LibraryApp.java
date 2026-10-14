
import java.io.IOException;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);

        try {
            LibraryFileManager.load(library);
            System.out.println("Library data loaded.");
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Could not load data: " + e.getMessage());
        }

        boolean running = true;

        while (running) {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add item");
            System.out.println("2. Register member");
            System.out.println("3. Borrow item");
            System.out.println("4. Return item");
            System.out.println("5. List overdue items");
            System.out.println("6. Search by title");
            System.out.println("7. List all items");
            System.out.println("8. Save and exit");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            try {
                switch (choice) {
                    case "1" -> {
                        System.out.print("Enter item ID: ");
                        String id = input.nextLine();
                        System.out.print("Enter title: ");
                        String title = input.nextLine();
                        System.out.print("Book or DVD? ");
                        String type = input.nextLine();

                        LibraryItem item;
                        if (type.equalsIgnoreCase("book")) {
                            item = new Book(id, title);
                        } else if (type.equalsIgnoreCase("dvd")) {
                            item = new Dvd(id, title);
                        } else {
                            System.out.println("Invalid item type.");
                            break;
                        }

                        library.addItem(item);
                        System.out.println("Item added.");
                    }
                    case "2" -> {
                        System.out.print("Enter member ID: ");
                        String id = input.nextLine();
                        System.out.print("Enter member name: ");
                        String name = input.nextLine();

                        library.registerMember(new Member(id, name));
                        System.out.println("Member registered.");
                    }
                    case "3" -> {
                        System.out.print("Enter member ID: ");
                        String memberId = input.nextLine();
                        System.out.print("Enter item ID: ");
                        String itemId = input.nextLine();

                        library.borrow(memberId, itemId);
                        System.out.println("Item borrowed successfully.");
                    }
                    case "4" -> {
                        System.out.print("Enter item ID: ");
                        library.giveBack(input.nextLine());
                        System.out.println("Item returned.");
                    }
                    case "5" -> {
                        var overdue = library.listOverdueItems();

                        if (overdue.isEmpty()) {
                            System.out.println("No overdue items.");
                        } else {
                            overdue.forEach(System.out::println);
                        }
                    }
                    case "6" -> {
                        System.out.print("Enter title to search: ");
                        String title = input.nextLine();

                        var results = library.searchByTitle(title);

                        if (results.isEmpty()) {
                            System.out.println("No matching items.");
                        } else {
                            results.forEach(System.out::println);
                        }
                    }
                    case "7" ->
                        library.getItems().values()
                            .forEach(System.out::println);

                    case "8" -> running = false;

                    default -> System.out.println("Invalid option.");
                }
            } } catch (ItemNotAvailableException
         | MemberLimitExceededException
         | IllegalArgumentException
         | IllegalStateException e)  {
                System.out.println("Error: " + e.getMessage());
            }
        }

        try {
            LibraryFileManager.save(library);
            System.out.println("Library data saved.");
        } catch (IOException e) {
            System.out.println("Could not save data: " + e.getMessage());
        }

        input.close();
        System.out.println("Goodbye!");
    }
}
