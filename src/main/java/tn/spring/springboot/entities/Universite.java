package tn.spring.springboot.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
     private Long idUniv;
    private String nomUniv ;



    public Long getIdUniv() {
        return idUniv;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public Set<Departement> getDepartements() {
        return departements;
    }


    public void setIdUniv(Long idUniv) {
        this.idUniv = idUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }

    public void setDepartements(Set<Departement> departements) {
        this.departements = departements;
    }


    @Override
    public String toString() {
        return "Universite{" +
                "idUniv=" + idUniv +
                ", nomUniv='" + nomUniv + '\'' +
                ", departements=" + departements +
                '}';
    }

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements ;

}
