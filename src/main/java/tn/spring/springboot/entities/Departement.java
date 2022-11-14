package tn.spring.springboot.entities;











import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder


@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepartement;
    private String nomDepartement;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "departements",fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Etudiant> etudiants;


    @Override
    public String toString() {
        return "Departement{" +
                "idDepartement=" + idDepartement +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", etudiants=" + etudiants +
                '}';
    }
}






