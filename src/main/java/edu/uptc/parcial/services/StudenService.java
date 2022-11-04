package edu.uptc.parcial.services;

import edu.uptc.parcial.entities.Student;
import edu.uptc.parcial.repositories.StudentRepository;

import java.util.List;

public class StudenService {

    private StudentRepository studentRepository;

    public StudenService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
