package tn.spring.springboot.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Universite  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id_univ;
    private String nom_univ ;



    public Long getIdUniv() {
        return id_univ;
    }

    public String getNomUniv() {
        return nom_univ;
    }

    public Set<Departement> getDepartements() {
        return departements;
    }


    public void setIdUniv(Long idUniv) {
        this.id_univ = idUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nom_univ = nomUniv;
    }

    public void setDepartements(Set<Departement> departements) {
        this.departements = departements;
    }


    @Override
    public String toString() {
        return "Universite{" +
                ", nomUniv='" + nom_univ + '\'' +
                ", departements=" + departements +
                '}';
    }

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements ;

}
