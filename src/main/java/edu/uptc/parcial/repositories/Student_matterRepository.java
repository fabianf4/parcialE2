package edu.uptc.parcial.repositories;

import edu.uptc.parcial.entities.Student_matter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface Student_matterRepository extends JpaRepository<Student_matter, Integer> {

}
