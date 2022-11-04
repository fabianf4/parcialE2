package edu.uptc.parcial.services;

import edu.uptc.parcial.entities.Matter;
import edu.uptc.parcial.repositories.MattersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatterService {

    private MattersRepository mattersRepository;

    public MatterService(MattersRepository mattersRepository) {
        this.mattersRepository = mattersRepository;
    }

    public Matter save(Matter matter) {
       return mattersRepository.save(matter);
    }

    public List<Matter> getMatters() {
          return mattersRepository.findAll();
    }

}

