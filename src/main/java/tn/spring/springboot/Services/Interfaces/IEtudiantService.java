package tn.spring.springboot.Services.Interfaces;

import tn.spring.springboot.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public Long AjouterEtudiant(Etudiant E) ;
    public List<Etudiant> getAllEtudiant() ;

    Boolean deleteEtudiant(Long id);
    Boolean update(Etudiant E);

    public void assignEtudiantToDepartment(Long etudiantId ,Long departmentId) ;
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat,Long idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Long idDepartement);

}
