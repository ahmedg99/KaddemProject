package tn.spring.springboot.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Data
public class nour implements Serializable {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;
    private String name ;





}
