package tn.spring.springboot.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor /*   génère un constructeur vide */
@AllArgsConstructor /*   genere un constrcuteur avec tout les attruibiute */
//RequiredArgsConstructor  /*   genere un constructor avec tout les attributs   non null */
@ToString
@EqualsAndHashCode
public class Equipe {
    @Id

@Getter
@Setter

    private Long idEquipe;
    private String nomEsuipe ;
    private Niveau niveau ;

    @ManyToMany(mappedBy = "equipes",cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants ;

    @OneToOne
    private DetailEquipe detailEquipe ;


}
