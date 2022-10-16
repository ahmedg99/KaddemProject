package tn.spring.springboot.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.DetailEquipeRepository;
import tn.spring.springboot.Services.Interfaces.IDetailEquipe;
import tn.spring.springboot.entities.DetailEquipe;

import java.util.List;

@Service
public class DetailEquipeImp implements IDetailEquipe {


    @Autowired
    DetailEquipeRepository detailEquipeRepository ;

    @Override
    public Long AjouterDetailEquipe(DetailEquipe D) {
        detailEquipeRepository.save(D);
        return D.getIdDetailEquipe();
    }

    @Override
    public List<DetailEquipe> getAllDE() {
        return detailEquipeRepository.findAll();
    }
}
