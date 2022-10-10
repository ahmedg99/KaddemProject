package tn.spring.springboot.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.EtudiantRepository;
import tn.spring.springboot.entities.Etudiant;

@Service
@Slf4j
public class EtudiantServiceImp  implements IEtudiantService{

    @Autowired
    EtudiantRepository etudiantRepository ;


    @Override
    public Long AjouterEtudiant(Etudiant E) {
        etudiantRepository.save(E) ;
        log.info("ajouter etudiant");
        return E.getIdEtudiant();
    }
}
