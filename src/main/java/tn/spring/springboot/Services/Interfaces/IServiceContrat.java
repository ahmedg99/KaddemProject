package tn.spring.springboot.Services.Interfaces;

import tn.spring.springboot.entities.Contrat;

import java.util.Date;
import java.util.List;

public interface IServiceContrat {
    public Long AjouterContrat(Contrat C);
    public List<Contrat> getAllContracts() ;
    public String deleteContrat(Contrat C) ;
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE);
    // public String updateContrat(Contrat C) ;
    public void updateStatusContrat() ;
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);
    Integer nbContratsValides(Date startDate, Date endDate);

}
