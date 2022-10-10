package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.IEtudiantService;
import tn.spring.springboot.entities.Etudiant;

@RestController
@RequestMapping("/EtudiantController")
public class EtudiantController {

    @Autowired
    IEtudiantService etudiantService ;
    @GetMapping("/")
    public String sayHello() {
        return "Hello world" ;
    }
    @PostMapping("/add")
    @ResponseBody
    public void addEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.AjouterEtudiant(etudiant);

    }



}
