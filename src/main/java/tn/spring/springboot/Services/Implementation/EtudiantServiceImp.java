package tn.spring.springboot.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.EtudiantRepository;
import tn.spring.springboot.Services.Interfaces.IEtudiantService;
import tn.spring.springboot.entities.Etudiant;

import java.util.List;

@Service
@Slf4j
public class EtudiantServiceImp  implements IEtudiantService {

    @Autowired
    EtudiantRepository etudiantRepository ;


    @Override
    public Long AjouterEtudiant(Etudiant E) {
        etudiantRepository.save(E) ;
        log.info("ajouter etudiant");
        return E.getIdEtudiant();
    }

     public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }
}
