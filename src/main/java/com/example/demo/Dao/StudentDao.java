package com.example.demo.Dao;
import com.example.demo.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("fakeData")
public class StudentDao implements DB_FAKE_StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){

            {
                put(1, new Student(1, "sad", "Comp Sci"));
                put(2, new Student(2, "bad", "Comp Sci"));
                put(3, new Student(3, "thad", "Poly Sci"));
            }

        };
    }

    @Override
    public Collection<Student> getAllStudents(){

        return students.values();
    }
    @Override
    public Student getStudentById(int id){
        return students.get(id);
    }

    @Override
    public void removeStudentById(int id){
        students.remove(id);
    }

    @Override
    public void addStudent(Student student){
        if (students.containsKey(student.getId())) {
            return;
        }
        student.setId(students.size()+1);
        students.put(student.getId(), student);

    }

    @Override
    public void updateStudent(Student student){
        if (students.containsKey(student.getId())) {
            students.put(student.getId(), student);
        }
    }

}
