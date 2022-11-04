package edu.uptc.parcial.services;

import edu.uptc.parcial.entities.Student_matter;
import edu.uptc.parcial.repositories.Student_matterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_matterService {

    Student_matterRepository student_matterRepository;

    public Student_matterService(Student_matterRepository student_matterRepository) {
        this.student_matterRepository = student_matterRepository;
    }

    public Student_matter save(Student_matter student_matter) {
        return student_matterRepository.save(student_matter);
    }

    public Student_matter delete(Student_matter student_matter) {
        student_matterRepository.delete(student_matter);
        return student_matter;
    }

    public Student_matter update(Student_matter student_matter) {
        return student_matterRepository.save(student_matter);
    }

    public List<Student_matter> getStudent_matters() {
        return student_matterRepository.findAll();
    }
}
