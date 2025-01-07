package com.example.demo.Dao;

import com.example.demo.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
@Qualifier("DB")
public class DB implements DB_FAKE_StudentDao {

//    Connection conn; //databse connection goes here

    @Override
    public Collection<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }
}
