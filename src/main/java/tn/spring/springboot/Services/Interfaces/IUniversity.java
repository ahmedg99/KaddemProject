package tn.spring.springboot.Services.Interfaces;


import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Universite;

import java.util.List;
import java.util.Set;

public interface IUniversity {
    public Long AjoutUniversity(Universite C);
    public List<Universite> getAllUniversities() ;

    void assignUniversiteToDepartement(Long idUniversite, Long idDepartement);
    Set<Departement> getAllDepartments(Long idUniversity) ;
 }
