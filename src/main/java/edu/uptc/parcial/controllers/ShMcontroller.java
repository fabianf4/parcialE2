package edu.uptc.parcial.controllers;

import edu.uptc.parcial.entities.Student_has_matter;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shms")
public class ShMcontroller {

    ShMcontroller shMcontroller;

    public ShMcontroller(ShMcontroller shMcontroller) {
        this.shMcontroller = shMcontroller;
    }

    public Student_has_matter save(@RequestBody Student_has_matter student_has_matter) {
        return shMcontroller.save(student_has_matter);
    }

    public List<Student_has_matter> getShM() {
        return shMcontroller.getShM();
    }
}
