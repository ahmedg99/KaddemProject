package tn.spring.springboot.Services.Interfaces;

import tn.spring.springboot.entities.Contrat;

import java.util.List;

public interface IServiceContrat {
    public Long AjouterContrat(Contrat C);
    public List<Contrat> getAllContracts() ;
    public String deleteContrat(Contrat C) ;
   // public String updateContrat(Contrat C) ;


}