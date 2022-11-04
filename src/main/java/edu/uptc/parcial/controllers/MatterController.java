package edu.uptc.parcial.controllers;

import edu.uptc.parcial.entities.Matter;
import edu.uptc.parcial.services.MatterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matters")
public class MatterController {

    MatterService matterService;

    public MatterController(MatterService matterService) {
        this.matterService = matterService;
    }
    @GetMapping
    public List<Matter> getMatters() {
        return matterService.getMatters();
    }

    @PostMapping
    public Matter save(@RequestBody Matter matter) {
        return matterService.save(matter);
    }

    @DeleteMapping
    public Matter delete(@RequestBody Matter matter) {
        return matterService.delete(matter);
    }

    @PutMapping
    public Matter update(@RequestBody Matter matter) {
        return matterService.update(matter);
    }
}
