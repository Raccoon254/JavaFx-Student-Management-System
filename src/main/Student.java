package main;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Student extends User {
    private List<Course> enrolledCourses;
    private Map<Module, Integer> marks;

    public Student(int userId, String firstName, String surname, String gender, String email, LocalDate dob, String password) {
        super(userId, firstName, surname, gender, email, dob, password);
    }

    public List<Course> viewCourses() {
        // Implement view courses logic
        return null;
    }

    public Map<Module, Integer> viewMarks() {
        // Implement view marks logic
        return null;
    }

    public void downloadMaterial(Module module, int week) {
        // Implement download material logic
    }

    public void viewDecision() {
        // Implement view decision logic
    }
}