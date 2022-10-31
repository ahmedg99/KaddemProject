package tn.spring.springboot.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.EquipeRespository;
import tn.spring.springboot.Services.Interfaces.IEquipeService;
import tn.spring.springboot.entities.Equipe;

import java.util.List;
@Service
@Slf4j
public class EquipeServiceImp implements IEquipeService {


    @Autowired
    EquipeRespository equipeRespository ;



    @Override
    public Long AjouterEquipe(Equipe E) {

        equipeRespository.save(E) ;
        log.info("ajouter equipe");
        return E.getIdEquipe();





    }

    @Override
    public List<Equipe> getAllEquipe() {
        return equipeRespository.findAll();
    }

    @Override
    public Equipe getEquipeById(Long id) {
        return equipeRespository.findByIdEquipe(id);
    }
}
