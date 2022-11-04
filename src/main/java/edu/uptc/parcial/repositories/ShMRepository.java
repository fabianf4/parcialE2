package edu.uptc.parcial.repositories;

import edu.uptc.parcial.entities.Student_has_matter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShMRepository extends JpaRepository<Student_has_matter, Integer> {

}

