import java.util.Scanner;

public class StudentInformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== STUDENT INFORMATION SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("❌ Invalid input! Enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> manager.viewStudents();
                case 3 -> manager.searchStudent();
                case 4 -> manager.updateStudent();
                case 5 -> manager.deleteStudent();
                case 6 -> {
                    System.out.println("Exiting... Thank You!");
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid choice! Try again.");
            }
        }
    }
}

