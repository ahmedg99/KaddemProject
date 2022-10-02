package tn.spring.springboot.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Equipe {

@Getter
@Setter
    private Long idEsuipe;
    private String nomEsuipe ;
    private Niveau niveau ;

    public void setIdEsuipe(Long idEsuipe) {
        this.idEsuipe = idEsuipe;
    }

    @Id
    public Long getIdEsuipe() {
        return idEsuipe;
    }



}
