import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent() {
        String name = ValidationUtils.inputString("Enter Name: ");
        int age = ValidationUtils.validatePositiveInt("Enter Age: ");
        String grade = ValidationUtils.validateGrade("Enter Grade (A-F or 1-10): ");
        String studentId = ValidationUtils.inputString("Enter Student ID: ");
        String contact = ValidationUtils.inputString("Enter Contact Number: ");

        students.add(new Student(name, age, grade, studentId, contact));
        System.out.println("✔ Student Added Successfully!");
    }

    // View All Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("❌ No student records found!");
            return;
        }

        System.out.printf("\n%-15s %-20s %-8s %-8s %-15s\n",
                "Student ID", "Name", "Age", "Grade", "Contact");
        System.out.println("-".repeat(70));

        for (Student s : students) {
            System.out.printf("%-15s %-20s %-8d %-8s %-15s\n",
                    s.getStudentId(), s.getName(), s.getAge(),
                    s.getGrade(), s.getContact());
        }
    }

    // Search Student
    public void searchStudent() {
        String key = ValidationUtils.inputString("Enter Student ID or Name to Search: ");

        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(key) ||
                s.getName().equalsIgnoreCase(key)) {

                System.out.println("\n----- STUDENT DETAILS -----");
                System.out.println("Name      : " + s.getName());
                System.out.println("Age       : " + s.getAge());
                System.out.println("Grade     : " + s.getGrade());
                System.out.println("Student ID: " + s.getStudentId());
                System.out.println("Contact   : " + s.getContact());
                return;
            }
        }

        System.out.println("❌ Student not found!");
    }

    // Update Student
    public void updateStudent() {
        String id = ValidationUtils.inputString("Enter Student ID to Update: ");

        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {

                String name = ValidationUtils.inputString("Enter New Name: ");
                int age = ValidationUtils.validatePositiveInt("Enter New Age: ");
                String grade = ValidationUtils.validateGrade("Enter New Grade: ");
                String contact = ValidationUtils.inputString("Enter New Contact: ");

                s.setName(name);
                s.setAge(age);
                s.setGrade(grade);
                s.setContact(contact);

                System.out.println("✔ Student Updated Successfully!");
                return;
            }
        }
        System.out.println("❌ Student ID not found!");
    }

    // Delete Student
    public void deleteStudent() {
        String id = ValidationUtils.inputString("Enter Student ID to Delete: ");

        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                students.remove(s);
                System.out.println("✔ Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("❌ Student ID not found!");
    }
}
