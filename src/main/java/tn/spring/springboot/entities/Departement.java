package tn.spring.springboot.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
public class Departement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")
    @Getter
    @Setter
    private Long idDepartement ;
    private String nomDepartement ;


}
