package tn.spring.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 import tn.spring.springboot.entities.Departement;

import java.util.List;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {
    Departement findByIdDepartement(Long id ) ;

   // List<Departement>  findAllByun(Etudiant E) ;
}

