import java.util.Scanner;

public class ValidationUtils {

    private static Scanner sc = new Scanner(System.in);

    // Valid positive integer input
    public static int validatePositiveInt(String message) {
        int number;
        while (true) {
            System.out.print(message);

            try {
                number = Integer.parseInt(sc.nextLine());
                if (number > 0) return number;
                else System.out.println("❌ Age must be a positive number!");
            } catch (Exception e) {
                System.out.println("❌ Invalid number! Try again.");
            }
        }
    }

    // Validate grade
    public static String validateGrade(String message) {
        String grade;
        while (true) {
            System.out.print(message);
            grade = sc.nextLine();

            if (grade.matches("[A-Fa-f]") || grade.matches("[1-9]|10")) {
                return grade.toUpperCase();
            }

            System.out.println("❌ Invalid grade! Enter A-F or 1-10.");
        }
    }

    // Normal string input
    public static String inputString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}

