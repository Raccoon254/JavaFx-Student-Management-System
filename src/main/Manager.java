package main;

import java.time.LocalDate;
import java.util.List;

public class Manager extends User {
    private List<User> managedUsers;

    public Manager(int userId, String firstName, String surname, String gender, String email, LocalDate dob, String password) {
        super(userId, firstName, surname, gender, email, dob, password);
    }

    public void approveUser(User user) {
        // Implement approve user logic
    }

    public void manageAccount(User user, String action) {
        // Implement manage account logic
    }

    public void assignModuleToLecturer(Module module, Lecturer lecturer) {
        // Implement assign module to lecturer logic
    }

    public void enrollStudent(Course course, Student student) {
        // Implement enroll student logic
    }

    public void issueDecision(Student student) {
        // Implement issue decision logic
    }

    public void addBusinessRule(String description, int maxAttempts) {
        // Implement add business rule logic
    }

    public void addCourse(String code, String name, String description) {
        // Implement add course logic
    }

    public void addModule(String code, String name, int credit) {
        // Implement add module logic
    }

    public void assignModuleToCourse(Module module, Course course) {
        // Implement assign module to course logic
    }

    public String displayCourseDetails(Course course) {
        // Implement display course details logic
        return null;
    }

    public String displayModuleDetails(Module module) {
        // Implement display module details logic
        return null;
    }

    public void updateCourseInfo(Course course, String description) {
        // Implement update course info logic
    }
}