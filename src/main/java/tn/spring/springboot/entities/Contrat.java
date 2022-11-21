package tn.spring.springboot.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    private Long idContrat;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateDebutContrat ;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date FinContrat ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite ;
    private boolean archive ;
    private int montantContrat ;

    @ManyToOne
    private Etudiant etudiant ;

    public Long getIdContrat() {
        return idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public Date getFinContrat() {
        return FinContrat;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public boolean isArchive() {
        return archive;
    }

    public int getMontantContrat() {
        return montantContrat;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setIdContrat(Long idContrat) {
        this.idContrat = idContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public void setFinContrat(Date finContrat) {
        FinContrat = finContrat;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public void setMontantContrat(int montantContrat) {
        this.montantContrat = montantContrat;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
