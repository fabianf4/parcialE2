package edu.uptc.parcial.services;


import edu.uptc.parcial.entities.Student_has_matter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShMService {
    private ShMService shMService;

    private MatterService matterService;
    private StudenService studenService;

    public ShMService(ShMService shMService, MatterService matterService, StudenService studenService) {
        this.shMService = shMService;
        this.matterService = matterService;
        this.studenService = studenService;
    }


    public Student_has_matter save(Student_has_matter studen_has_matter) {
        return shMService.save(studen_has_matter);
    }

    public List<Student_has_matter> getShM() {
        return shMService.getShM();
    }
}
