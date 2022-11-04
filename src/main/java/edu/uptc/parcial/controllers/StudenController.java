package edu.uptc.parcial.controllers;

import edu.uptc.parcial.entities.Student;
import edu.uptc.parcial.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudenController {
    StudentService studentService;

    public StudenController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PutMapping
    public Student update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping
    public Student delete(@RequestBody Student student) {
        return studentService.delete(student);
    }
}
