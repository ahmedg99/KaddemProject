package tn.spring.springboot.entities;



import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
 public class Departement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")

    private Long idDepartement ;
    private String nomDepartement ;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return Objects.equals(idDepartement, that.idDepartement) && Objects.equals(nomDepartement, that.nomDepartement) && Objects.equals(etudiants, that.etudiants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDepartement, nomDepartement, etudiants);
    }



    public Long getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(Long idDepartement) {
        this.idDepartement = idDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

      @OneToMany(cascade = CascadeType.ALL,mappedBy = "departements")
    private Set<Etudiant> etudiants ;

    @Override
    public String toString() {
        return "Departement{" +
                "idDepartement=" + idDepartement +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", etudiants="  +
                '}';
    }
}