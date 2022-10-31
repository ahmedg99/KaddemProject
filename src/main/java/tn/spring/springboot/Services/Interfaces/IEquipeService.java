package tn.spring.springboot.Services.Interfaces;

import tn.spring.springboot.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    public Long AjouterEquipe(Equipe E) ;
    public List<Equipe> getAllEquipe() ;
    public Equipe getEquipeById(Long id ) ;
}
