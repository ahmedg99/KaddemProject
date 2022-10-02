package tn.spring.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Universite {

    private Long idUniv;
    private String nomUniv ;

    public void setIdUniv(Long idUniv) {
        this.idUniv = idUniv;

    }

    @Id
    public Long getIdUniv() {
        return idUniv;
    }


    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }
}
