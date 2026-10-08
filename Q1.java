import java.util.ArrayList;
import java.util.Scanner;
class Library {
    ArrayList<String> books = new ArrayList<>();
    void addBook(String book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }
    void removeBook(String book) {
        books.remove(book);
    }
    void displayBooks() {
        System.out.println("Current Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
public class Q1_Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Display All Books");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.print("Enter book title: ");
            String book = sc.nextLine();
            library.addBook(book);
            library.displayBooks();
        }
    }
}
