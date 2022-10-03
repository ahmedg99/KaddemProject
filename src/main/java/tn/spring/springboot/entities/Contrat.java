package tn.spring.springboot.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
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
