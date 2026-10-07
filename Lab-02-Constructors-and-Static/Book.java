public class Book {

    String title;
    String author;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
    }

    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "James Gosling");

        book1.displayDetails();
        book2.displayDetails();
    }
}
