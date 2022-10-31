package tn.spring.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.DetailEquipe;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.entities.Etudiant;

import java.util.List;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Long> {
   // DetailEquipe  findByIdDetailEquipe(Long id ) ;
     //List<DetailEquipe> findByIdDetailEquipeAndAndEquipe(Long id , Equipe e ) ;
}
