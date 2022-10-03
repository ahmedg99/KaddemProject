package tn.spring.springboot.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor /*   génère un constructeur vide */
@AllArgsConstructor /*   genere un constrcuteur avec tout les attruibiute */
//@RequiredArgsConstructor  /*   genere un constructor avec tout les attributs   non null */
@ToString
@EqualsAndHashCode
public class Contrat implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name ="idContrat")
    @Getter @Setter
    private Long idContrat;
    private Date dateDebutContrat ;
    private Date FinContrat ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite ;
    private boolean archive ;
    private int montantContrat ;

    @ManyToOne
    private Etudiant etudiant ;







}
