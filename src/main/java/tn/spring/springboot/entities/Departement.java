package tn.spring.springboot.entities;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@ToString

 public class Departement  implements Serializable {
    @Id @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")

    private Long idDepartement ;
    private String nomDepartement ;






      @OneToMany(cascade = CascadeType.ALL,mappedBy = "departements")
    private Set<Etudiant> etudiants ;


}