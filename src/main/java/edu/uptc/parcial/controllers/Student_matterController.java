package edu.uptc.parcial.controllers;

import edu.uptc.parcial.entities.Student_matter;
import edu.uptc.parcial.services.Student_matterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student_matter")
public class Student_matterController {

    Student_matterService student_matterService;

    public Student_matterController(Student_matterService student_matterService) {
        this.student_matterService = student_matterService;
    }

    @PostMapping
    public Student_matter save(@RequestBody Student_matter student_matter) {
        return student_matterService.save(student_matter);
    }

    @GetMapping
    public List<Student_matter> getStudent_matters() {
        return student_matterService.getStudent_matters();
    }

    @DeleteMapping
    public Student_matter delete(@RequestBody Student_matter student_matter) {
        return student_matterService.delete(student_matter);
    }

    @PutMapping
    public Student_matter update(@RequestBody Student_matter student_matter) {
        return student_matterService.update(student_matter);
    }
}
