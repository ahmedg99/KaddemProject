package tn.spring.springboot.Services.Interfaces;

import tn.spring.springboot.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public Long AjouterEtudiant(Etudiant E) ;
    public List<Etudiant> getAllEtudiant() ;
}
