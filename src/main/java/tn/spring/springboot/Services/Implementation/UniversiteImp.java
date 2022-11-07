package tn.spring.springboot.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.DepartementRepository;
import tn.spring.springboot.Repositories.UniversiteRepository;
import tn.spring.springboot.Services.Interfaces.IUniversity;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Universite;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class UniversiteImp implements IUniversity {


    @Autowired
    UniversiteRepository universiteRepository ;
    @Autowired
    DepartementRepository departementRepository ;


    @Override
    public Long AjoutUniversity(Universite u) {
        universiteRepository.save(u);
        log.info("university added ");
        return u.getIdUniv();

    }

    @Override
    public List<Universite> getAllUniversities() {
        return universiteRepository.findAll();
    }


    @Override
    public void assignUniversiteToDepartement(Long idUniversite, Long idDepartement) {
        Universite universite   = universiteRepository.findById(idUniversite).orElse(null);

        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        System.out.println("dep : " + departement + "univer " + universite);
        universite.getDepartements().add(departement);
        universiteRepository.save(universite);
    }

}
