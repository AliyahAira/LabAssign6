import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResourceFactory factory = new ResourceFactory();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        boolean running = true;

        while (running) {
            System.out.println("\nSelect resource to borrow:");
            factory.printMenu();
            System.out.println("0. Exit");
            System.out.print("Enter choice (0-3): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (choice == 0) {
                running = false;
                System.out.println("Thank you! Exiting system.");
                break;
            }

            System.out.print("Enter title of the resource: ");
            String title = scanner.nextLine();

            BorrowableResource resource = factory.create(choice, title);

            if (resource != null) {
                student.borrowResource(resource);
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
