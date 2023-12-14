CREATE DATABASE UniversityManagement;

USE UniversityManagement;

CREATE TABLE Users (
    userId INT PRIMARY KEY,
    firstName VARCHAR(255),
    surname VARCHAR(255),
    gender VARCHAR(50),
    email VARCHAR(255),
    dob DATE,
    password VARCHAR(255),
    userType ENUM('Student', 'Lecturer', 'Manager')
);

CREATE TABLE Courses (
    courseId INT PRIMARY KEY,
    courseName VARCHAR(255),
    description TEXT,
    isUndergraduate BOOLEAN
);

CREATE TABLE Modules (
    moduleId INT PRIMARY KEY,
    moduleName VARCHAR(255),
    credits INT,
    associatedCourse INT,
    FOREIGN KEY (associatedCourse) REFERENCES Courses(courseId)
);

CREATE TABLE Materials (
    materialId INT PRIMARY KEY,
    type VARCHAR(255),
    content TEXT,
    associatedModule INT,
    FOREIGN KEY (associatedModule) REFERENCES Modules(moduleId)
);

CREATE TABLE EnrolledCourses (
    studentId INT,
    courseId INT,
    FOREIGN KEY (studentId) REFERENCES Users(userId),
    FOREIGN KEY (courseId) REFERENCES Courses(courseId),
    PRIMARY KEY (studentId, courseId)
);

CREATE TABLE Marks (
    studentId INT,
    moduleId INT,
    mark INT,
    FOREIGN KEY (studentId) REFERENCES Users(userId),
    FOREIGN KEY (moduleId) REFERENCES Modules(moduleId),
    PRIMARY KEY (studentId, moduleId)
);

CREATE TABLE BusinessRules (
    ruleId INT PRIMARY KEY,
    description TEXT,
    maxAttempts INT
);

CREATE TABLE Decisions (
    decisionId INT PRIMARY KEY,
    decisionType ENUM('Award', 'Resit', 'Withdraw'),
    studentId INT,
    FOREIGN KEY (studentId) REFERENCES Users(userId)
);