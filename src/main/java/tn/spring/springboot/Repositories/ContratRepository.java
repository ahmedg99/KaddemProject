package tn.spring.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.entities.Etudiant;

import java.util.Date;
import java.util.List;

@Repository
public interface ContratRepository  extends JpaRepository<Contrat, Long > {
    Contrat findByIdContrat(Long id ) ;
     List<Contrat> findByArchiveIsFalse() ;
     //List<Contrat> findByDateDebutContratAfterAndArchiveAndFinContratBefore();
    //Contrat affectContratToEtudiant (Long idContrat, String nomE, String prenomE);
}
