package tn.spring.springboot.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.DepartementRepository;
import tn.spring.springboot.Services.Interfaces.IDepartement;
import tn.spring.springboot.entities.Departement;

import java.util.List;
@Service
@Slf4j
public class DepartementService implements IDepartement {

@Autowired
    DepartementRepository departementRepository ;


    @Override
    public Long AjouterDepartement(Departement D) {
        departementRepository.save(D);
        log.info("ajouter equipe");
        return D.getIdDepartement();

     }

    @Override
    public List<Departement> getAllD() {
        return departementRepository.findAll();
    }


}
