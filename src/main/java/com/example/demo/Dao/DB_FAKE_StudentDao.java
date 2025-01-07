package com.example.demo.Dao;

import com.example.demo.Entity.Student;

import java.util.Collection;

public interface DB_FAKE_StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void addStudent(Student student);

    void updateStudent(Student student);
}
