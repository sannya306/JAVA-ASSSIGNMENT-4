import java.util.LinkedHashSet;
class CourseEnrollment {
    LinkedHashSet<String> students = new LinkedHashSet<>();
    void enrollStudent(String name) {
        if (students.add(name)) {
            System.out.println("Enrolled: " + name);
        } else {
            System.out.println(name + " is already enrolled");
        }
    }
    void displayEnrolledStudents() {
        System.out.println("Enrolled Students: " + students);
    }
}
public class Q5_CourseEnrollment {
    public static void main(String[] args) {
        CourseEnrollment course = new CourseEnrollment();
        course.enrollStudent("Aditi");
        course.enrollStudent("Rohan");
        course.enrollStudent("Aditi");
        course.displayEnrolledStudents();
    }
}
