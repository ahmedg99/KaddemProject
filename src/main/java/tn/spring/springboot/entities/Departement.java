package tn.spring.springboot.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity

public class Departement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")
    private Long idDepartement ;
    private String nomDepartement ;

    public Long getIdDepartement() {
        return idDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setIdDepartement(Long idDepartement) {
        this.idDepartement = idDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
}
