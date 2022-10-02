package tn.spring.springboot.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class DetailEquipe {

    @Getter @Setter
    private Long idDetailEquipe;
    private int salle ;
    private String thematique ;

    public void setIdDetailEquipe(Long idDetailEquipe) {
        this.idDetailEquipe = idDetailEquipe;
    }

    @Id
    public Long getIdDetailEquipe() {
        return idDetailEquipe;
    }
}
