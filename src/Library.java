import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<String> loans = new ArrayList<>();

    // Add a new book
    public void addBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();

        books.add(new Book(bookID, title, author));
        System.out.println("Book added successfully!");
    }

    // Register a new member
    public void addMember(Scanner scanner) {
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Member Email: ");
        String email = scanner.nextLine();

        members.add(new Member(memberID, name, email));
        System.out.println("Member registered successfully!");
    }

    // Issue a book to a member
    public void issueBook(Scanner scanner) {
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();

        Book book = findBook(bookID);
        if (book != null && book.isAvailable()) {
            book.borrowBook();
            loans.add("Member ID: " + memberID + " borrowed Book ID: " + bookID);
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book is either not found or already issued.");
        }
    }

    // Return a book
    public void returnBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();

        Book book = findBook(bookID);
        if (book != null) {
            book.returnBook();
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Search for a book
    public Book findBook(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null;
    }

    // Print all book details
    public void bookReport() {
        System.out.println("Book Report:");
        for (Book book : books) {
            System.out.println("ID: " + book.getBookID() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
        }
    }

    // Print all loan transactions
    public void loanReport() {
        System.out.println("Loan Transactions:");
        for (String loan : loans) {
            System.out.println(loan);
        }
    }
}
