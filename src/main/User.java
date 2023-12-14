package main;

import java.time.LocalDate;

public class User {
    protected int userId;
    protected String firstName;
    protected String surname;
    protected String gender;
    protected String email;
    protected LocalDate dob;
    protected String password;

    public User(int userId, String firstName, String surname, String gender, String email, LocalDate dob, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
        this.password = password;
    }

    public boolean login(String email, String password) {
        // Implement login logic
        return false;
    }

    public boolean updatePassword(String oldPassword, String newPassword) {
        // Implement password update logic
        return false;
    }
}