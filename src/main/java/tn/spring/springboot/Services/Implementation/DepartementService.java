package tn.spring.springboot.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.DepartementRepository;
import tn.spring.springboot.Repositories.UniversiteRepository;
import tn.spring.springboot.Services.Interfaces.IDepartement;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Universite;

import java.util.List;

@Service
@Slf4j
public class DepartementService implements IDepartement {

    @Autowired
    DepartementRepository departementRepository ;
    @Autowired
    UniversiteRepository universiteRepository ;



    @Override
    public Long AjouterDepartement(Departement D) {
        departementRepository.save(D);
        log.info("ajouter equipe");
        return D.getIdDepartement();

     }

    @Override
    public List<Departement> getAllByUniveristyId(Long idUniv) {
        Universite universite = universiteRepository.findById(idUniv).orElse(null);
        List<Departement> l = null;
        assert false;
        boolean b = l.addAll(universite.getDepartements());
        System.out.println(l);
        return  l  ;
    }

    @Override
    public List<Departement> getAllD() {


        return departementRepository.findAll();
    }





}
