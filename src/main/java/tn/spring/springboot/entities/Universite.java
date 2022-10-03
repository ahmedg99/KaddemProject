package tn.spring.springboot.entities;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@NoArgsConstructor /*   génère un constructeur vide */
@AllArgsConstructor /*   genere un constrcuteur avec tout les attruibiute */
//@RequiredArgsConstructor  /*   genere un constructor avec tout les attributs   non null */
@ToString
@EqualsAndHashCode
public class Universite {
    @Getter
    @Setter
    @Id


    private Long idUniv;
    private String nomUniv ;


@OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements ;



}
