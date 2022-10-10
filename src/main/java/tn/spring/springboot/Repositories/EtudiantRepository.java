package tn.spring.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Etudiant;
@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant , Long > {
}
