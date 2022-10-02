package tn.spring.springboot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name ="idContrat")
    private Long idContrat;
    private Date dateDebutContrat ;
    private Date FinContrat ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite ;
    private boolean archive ;
    private int montantContrat ;


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

    public Long getIdContrat() {
        return idContrat;
    }

    public void setId(Long id) {
        this.idContrat = id;
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

    @Id
    public Long getId() {
        return idContrat;
    }
}
