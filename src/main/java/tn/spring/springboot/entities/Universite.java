package tn.spring.springboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToMany()
    private Set<Departement> departements ;


    public Long getId_univ() {
        return id_univ;
    }

    public void setId_univ(Long id_univ) {
        this.id_univ = id_univ;
    }

    public String getNom_univ() {
        return nom_univ;
    }

    public void setNom_univ(String nom_univ) {
        this.nom_univ = nom_univ;
    }
}
