package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.Interfaces.IServiceContrat;
import tn.spring.springboot.entities.Contrat;

import java.util.List;

@RestController
@RequestMapping("/contrat")
public class ContratController {

    @Autowired
    IServiceContrat contratService ;
     @PostMapping("/add")
    @ResponseBody
    public void addContrat(@RequestBody Contrat c) {
         contratService.AjouterContrat(c) ;
    }


    @GetMapping(value = "/getAllContrat")
    @ResponseBody
    public List<Contrat> getAllContrat() {
        return  contratService.getAllContracts();
    }






}
