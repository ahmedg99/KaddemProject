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
    @Getter
    @Setter
    private Long idDepartement ;
    private String nomDepartement ;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departements")
    private Set<Etudiant> etudiants ;

}
