package tn.spring.springboot.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.ContratRepository;
import tn.spring.springboot.Repositories.EtudiantRepository;
import tn.spring.springboot.Services.Interfaces.IServiceContrat;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Etudiant;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class ContratServiceImp implements IServiceContrat {

    @Autowired
    ContratRepository contratRepository ;
    @Autowired
    EtudiantRepository etudiantRepository;



    @Override
    public Long AjouterContrat(Contrat C) {
        contratRepository.save(C) ;
        log.info("ajouter contrat");
        return C.getIdContrat() ;
    }

    @Override
    public List<Contrat> getAllContracts() {
        return contratRepository.findAll();
    }

    @Override
    public String deleteContrat(Contrat C) {
        if(contratRepository.findAll().contains(C)) {
            contratRepository.delete(C);
            return "contrat deleted" ;

        }
        return "Contrat not founded " ;
     }



    //@Scheduled(cron = "0 0 13 * * *")
     //@Scheduled(fixedRate = 1000)
    @Override
    public void updateStatusContrat() {
       // System.out.println("aslema");






    }

    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
                 float somme=0 ;
                 long monthsBetween = ChronoUnit.MONTHS.between((Temporal) startDate, (Temporal) endDate) ;


               return somme ;
    }



    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        Etudiant  etudiant = etudiantRepository.findByNomEAndPrenomE(nomE,prenomE);
        int sommeContratActive = 0;
        sommeContratActive = (int) etudiant.getContrats().stream().filter(c->c.isArchive()).count();
        if(sommeContratActive <5) {
            ce.setEtudiant(etudiant);
            contratRepository.save(ce);
        }
        return contratRepository.save(ce);
    }


    @Override
    public Integer nbContratsValides(Date startDate, Date endDate) {

        List<Contrat> listeallcontrats = contratRepository.findAll();

        return ( int ) listeallcontrats.stream().filter(c-> !c.isArchive()).count();
    }

/*
    @Override
    public String updateContrat(Contrat C) {

        if(contratRepository.findAll().contains(C)) {
            Optional<Contrat> oldc = contratRepository.findById(C.getIdContrat());
            if(!oldc.isPresent()){
                throw new ChangeSetPersister.NotFoundException("contrat with ID: " + meal.getId() + " does not exist. ");
            }
            Contrat existingContrat = oldc.get();
            existingContrat = C;
            contratRepository.save(oldc);
            return "updated " ;

            return "contrat updated" ;

        }
        return "Contrat not founded " ;
    }

*/


}
