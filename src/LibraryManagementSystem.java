import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    library.addBook(scanner);
                    break;
                case 2:
                    library.addMember(scanner);
                    break;
                case 3:
                    library.issueBook(scanner);
                    break;
                case 4:
                    library.returnBook(scanner);
                    break;
                case 5:
                    library.bookReport();
                    break;
                case 6:
                    library.loanReport();
                    break;
                case 7:
                    System.out.println("Exiting Application...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Library Management System");
        System.out.println("1. Add Book");
        System.out.println("2. Register Member");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");
        System.out.println("5. View Book Report");
        System.out.println("6. View Loan Report");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }
}
