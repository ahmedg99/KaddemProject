package tn.spring.springboot.Services.Interfaces;


import tn.spring.springboot.entities.Departement;

import java.util.List;

public interface IDepartement {
    public Long AjouterDepartement(Departement D) ;
    public List<Departement> getAllByUniveristyId(Long idUniv);
    public List<Departement> getAllD() ;
 }
