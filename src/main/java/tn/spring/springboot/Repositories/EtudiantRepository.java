package tn.spring.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.entities.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant , Long > {
    Etudiant  findAllByIdEtudiant(Long id) ;
    List<Etudiant> findAllByDepartements_IdDepartement(Long departmentid) ;
    Etudiant findByNomEAndPrenomE(String nomE,String prenomE) ;

}
