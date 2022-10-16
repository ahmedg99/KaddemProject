package tn.spring.springboot.Services.Interfaces;


import tn.spring.springboot.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipe {
    public Long AjouterDetailEquipe(DetailEquipe D) ;
    public List<DetailEquipe> getAllDE();
}
