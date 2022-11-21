package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.Interfaces.IServiceContrat;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Etudiant;


import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/contrat")
public class ContratController {

    @Autowired
    IServiceContrat contratService;

    @PostMapping("/add")
    @ResponseBody
    public void addContrat(@RequestBody Contrat c) {
        contratService.AjouterContrat(c);
    }


    @GetMapping(value = "/getAllContrat")
    @ResponseBody
    public List<Contrat> getAllContrat() {
        return contratService.getAllContracts();
    }


    @PutMapping(value = "/affectContratToEtudiant/{nomE}/{prenomE}")
    @ResponseBody
    public Contrat affectContratToEtudiant(@RequestBody Contrat c, @PathVariable String nomE, @PathVariable String prenomE) {
       return  contratService.affectContratToEtudiant(c, nomE, prenomE);

    }


    @GetMapping(value = "/nbContratsValides")
    @ResponseBody
    public int getAllContratValides(@RequestBody Date d1, @RequestBody Date d2 ) {
        return contratService.nbContratsValides(d1,d2);
    }


}
