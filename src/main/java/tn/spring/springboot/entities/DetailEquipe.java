package tn.spring.springboot.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor /*   génère un constructeur vide */
@AllArgsConstructor /*   genere un constrcuteur avec tout les attruibiute */
//@RequiredArgsConstructor  /*   genere un constructor avec tout les attributs   non null */
@ToString
@EqualsAndHashCode
public class DetailEquipe {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="idDetailEquipe")
@Getter
@Setter
    private Long idDetailEquipe;
    private int salle ;
    private String thematique ;

    @OneToOne
    private Equipe Equipe ;


}
