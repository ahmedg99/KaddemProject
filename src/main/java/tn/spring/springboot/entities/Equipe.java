package tn.spring.springboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
//@NoArgsConstructor /*   génère un constructeur vide */
//AllArgsConstructor /*   genere un constrcuteur avec tout les attruibiute */
//RequiredArgsConstructor  /*   genere un constructor avec tout les attributs   non null */
 //@EqualsAndHashCode

public class Equipe implements Serializable {
    @Id

    @GeneratedValue

    private Long idEquipe;
    private String nom_equipe ;
    @Enumerated(EnumType.ORDINAL)
    private Niveau niveau ;

    public Equipe() {
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "idEquipe=" + idEquipe +
                ", nom_equipe='" + nom_equipe + '\'' +
                ", niveau=" + niveau +
                ", etudiants=" + etudiants +
                ", detailEquipe=" + detailEquipe +
                '}';
    }


    public Equipe(String nom_equipe, Niveau niveau, Set<Etudiant> etudiants, DetailEquipe detailEquipe) {
        this.nom_equipe = nom_equipe;
        this.niveau = niveau;
        this.etudiants = etudiants;
        this.detailEquipe = detailEquipe;
    }

    public Long getIdEquipe() {
        return idEquipe;
    }

    public String getNom_equipe() {
        return nom_equipe;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public DetailEquipe getDetailEquipe() {
        return detailEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public void setnom_equipe(String nom_equipe) {
        this.nom_equipe = nom_equipe;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public void setDetailEquipe(DetailEquipe detailEquipe) {
        this.detailEquipe = detailEquipe;
    }

    @ManyToMany(mappedBy = "equipes",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Etudiant> etudiants ;

    @OneToOne
    private DetailEquipe detailEquipe ;


}
