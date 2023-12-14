package main;
import java.time.LocalDate;
import java.util.List;
public class Lecturer extends User {
    private List<String> qualifications;
    private List<Module> modulesTeaching;

    public Lecturer(int userId, String firstName, String surname, String gender, String email, LocalDate dob, String password) {
        super(userId, firstName, surname, gender, email, dob, password);
    }

    public void updateModuleInfo(Module module) {
        // Implement update module info logic
    }

    public void uploadMaterial(Module module, int week, Material material) {
        // Implement upload material logic
    }

    public void assignMarks(Student student, Module module, String markType, int mark) {
        // Implement assign marks logic
    }

    public List<Student> viewEnrolledStudents(Module module) {
        // Implement view enrolled students logic
        return null;
    }
}