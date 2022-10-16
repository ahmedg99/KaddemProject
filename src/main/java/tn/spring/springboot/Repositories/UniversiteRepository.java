package tn.spring.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.entities.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite  findById_univ(Long id) ;
    List<Universite>  findAllByDepartements(Departement d) ;
}
