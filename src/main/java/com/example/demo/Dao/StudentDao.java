package com.example.demo.Dao;
import com.example.demo.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

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

    public Collection<Student> getAllStudents(){

        return students.values();
    }
    public Student getStudentById(int id){
        return students.get(id);
    }

    public void removeStudentById(int id){
        students.remove(id);
    }

    public void addStudent(Student student){
        if (students.containsKey(student.getId())) {
            return;
        }
        student.setId(students.size()+1);
        students.put(student.getId(), student);

    }

    public void updateStudent(Student student){
        if (students.containsKey(student.getId())) {
            students.put(student.getId(), student);
        }
    }

}
