package edu.uptc.parcial.services;

import edu.uptc.parcial.entities.Student;
import edu.uptc.parcial.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student delete(Student student) {
        studentRepository.delete(student);
        return student;
    }

    public Student update(Student student) {
        return studentRepository.save(student);
    }
}
