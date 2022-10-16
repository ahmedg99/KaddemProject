package tn.spring.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Etudiant;

import java.util.List;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {
    Departement findAllByIdDepartement(Long id ) ;
    List<Departement>  findDepartementByEtudiantsExists(Etudiant E) ;
}

