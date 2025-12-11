public class Student {
    private String name;
    private int age;
    private String grade;
    private String studentId;
    private String contact;

    public Student(String name, int age, String grade, String studentId, String contact) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentId = studentId;
        this.contact = contact;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getStudentId() { return studentId; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
