package tn.spring.springboot.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Repositories.UniversiteRepository;
import tn.spring.springboot.Services.Interfaces.IUniversity;
import tn.spring.springboot.entities.Universite;

import java.util.List;
@Service
@Slf4j
public class UniversiteImp implements IUniversity {


    @Autowired
    UniversiteRepository universiteRepository ;


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
}
