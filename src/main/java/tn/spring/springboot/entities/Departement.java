package tn.spring.springboot.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Departement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")
    //@Getter
    //@Setter
    private Long idDepartement ;
    private String nomDepartement ;

    public void setIdDepartement(Long idDepartement) {
        this.idDepartement = idDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Long getIdDepartement() {
        return idDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "idDepartement=" + idDepartement +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", etudiants=" + etudiants +
                '}';
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departements")
    private Set<Etudiant> etudiants ;

}
