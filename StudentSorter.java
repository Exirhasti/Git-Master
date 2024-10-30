import java.util.Arrays;
import java.util.Comparator;

class Student {
    private String firstName;
    private String lastName;
    private int studentId;

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}

public class StudentSorter {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Mahak", "Mohammadi", 46),
                new Student("Kimia", "Sedaghati", 39),
                new Student("Golsa", "Saberi", 96),
                new Student("Arman", "GhorbanPour", 80),
                new Student ("tina" , "baouj" , 70),
                new Student("parsa" , "moradi" , 49)
            
        };

        // Sort by first name
        Arrays.sort(students, Comparator.comparing(Student::getFirstName));
        System.out.println("Sorted by First Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by last name
        Arrays.sort(students, Comparator.comparing(Student::getLastName));
        System.out.println("\nSorted by Last Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by student ID
        Arrays.sort(students, Comparator.comparingInt(Student::getStudentId));
        System.out.println("\nSorted by Student ID:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
