public class Book {

    String title;
    String author;
    double price;

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.price = 25.50;

        book1.displayBookDetails();
    }
}
