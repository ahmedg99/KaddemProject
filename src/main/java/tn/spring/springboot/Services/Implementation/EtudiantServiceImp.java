package tn.spring.springboot.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.spring.springboot.Repositories.ContratRepository;
import tn.spring.springboot.Repositories.DepartementRepository;
import tn.spring.springboot.Repositories.EquipeRespository;
import tn.spring.springboot.Repositories.EtudiantRepository;
import tn.spring.springboot.Services.Interfaces.IEtudiantService;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.entities.Etudiant;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EtudiantServiceImp  implements IEtudiantService {

    @Autowired
    EtudiantRepository etudiantRepository ;
    @Autowired

    DepartementRepository departementRepository ;
    @Autowired

    ContratRepository contratRepository ;
    @Autowired
    EquipeRespository equipeRespository ;


    @Override
    public Long AjouterEtudiant(Etudiant E) {
        etudiantRepository.save(E) ;
        log.info("ajouter etudiant");
        return E.getIdEtudiant();
    }

     public List<Etudiant> getAllEtudiant() {
         //System.out.println(etudiantRepository.findAll());

         return etudiantRepository.findAll();
    }

    @Override
    public Boolean deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
        return true ;
    }

    public Boolean update(Etudiant E ) {
         etudiantRepository.save(E) ;
        return true ;
    }

    @Override
    public void assignEtudiantToDepartment(Long etudiantId, Long departmentId) {
        Departement  D1 = departementRepository.findByIdDepartement(departmentId);  ;
        Etudiant E1 = etudiantRepository.findById(etudiantId).orElse(null);
        System.out.println("dep : "+D1);
        System.out.println("etud : "+E1);
        System.out.println("dep : "+D1);
        E1.setDepartements(D1);
            etudiantRepository.save(E1);

    }

    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat, Long idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).get();
        Equipe equipe = equipeRespository.findById(idEquipe).get();
             e.getContrats().add(contrat);
             e.getEquipes().add(equipe);
            // contrat.setEtudiant(e);
              etudiantRepository.save(e);
              //etudiantRepository.save(contrat);
              System.out.println(e.getContrats());

        return e ;

    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Long idDepartement) {
         return etudiantRepository.findAllByDepartements_IdDepartement(idDepartement)
                ;
    }




}
