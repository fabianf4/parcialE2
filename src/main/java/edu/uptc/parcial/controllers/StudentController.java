package edu.uptc.parcial.controllers;

import edu.uptc.parcial.entities.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentController studentController;

    public StudentController(StudentController studentController) {
        this.studentController = studentController;
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentController.save(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentController.getStudents();
    }

}
