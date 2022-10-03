package tn.spring.springboot.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Universite {
    @Getter
    @Setter

    private Long idUniv;
    private String nomUniv ;

    public void setIdUniv(Long idUniv) {
        this.idUniv = idUniv;

    }

    @Id
    public Long getIdUniv() {
        return idUniv;
    }



}
