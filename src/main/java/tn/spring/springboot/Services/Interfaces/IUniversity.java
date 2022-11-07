package tn.spring.springboot.Services.Interfaces;


import tn.spring.springboot.entities.Universite;

import java.util.List;

public interface IUniversity {
    public Long AjoutUniversity(Universite C);
    public List<Universite> getAllUniversities() ;

    void assignUniversiteToDepartement(Long idUniversite, Long idDepartement);
}
