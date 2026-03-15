import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Welcome to the Library Management System");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add book");
            System.out.println("2. Register member");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("5. Display all books");
            System.out.println("6. Display all members");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter book id: ");
                    String bookId = sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    System.out.println("Book added");
                    break;
                case 2:
                    System.out.print("Enter member id: ");
                    String memberId = sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    library.registerMember(new Member(memberId, name));
                    System.out.println("Member registered");
                    break;
                case 3:
                    System.out.print("Enter book id to borrow: ");
                    String borrowBookId = sc.nextLine();
                    System.out.print("Enter member id: ");
                    String borrowerId = sc.nextLine();
                    library.borrowBook(borrowBookId, borrowerId);
                    break;
                case 4:
                    System.out.print("Enter book id to return: ");
                    String returnBookId = sc.nextLine();
                    System.out.print("Enter member id: ");
                    String returnerId = sc.nextLine();
                    library.returnBook(returnBookId, returnerId);
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    library.displayMembers();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Unknown option");
            }
        }
    }
}