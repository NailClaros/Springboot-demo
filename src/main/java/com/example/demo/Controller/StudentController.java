package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    // -> /Student
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    // -> /Student/#
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable int id) {return studentService.getStudentById(id);}

    @RequestMapping(value= "/{id}",method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable int id) {
        studentService.removeStudentById(id);
    }

    @RequestMapping(value="/add", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

}
