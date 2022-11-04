package edu.uptc.parcial.repositories;

import edu.uptc.parcial.entities.Matter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MattersRepository extends JpaRepository<Matter, String> {

}
