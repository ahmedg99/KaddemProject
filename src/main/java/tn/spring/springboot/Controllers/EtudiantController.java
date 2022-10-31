package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.Interfaces.IEtudiantService;
import tn.spring.springboot.entities.Etudiant;

import java.util.List;

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
    @GetMapping(value = "/etudiants")
    @ResponseBody
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiant() ;
    }

    @DeleteMapping(value = "/delete/{id}")
    @ResponseBody
    public Boolean delete(@PathVariable("id") Long id ) {
        return etudiantService.deleteEtudiant( id );
    }


    @PutMapping(value = "/update")
    @ResponseBody
    public void update(@RequestBody Etudiant etudiant ) {
         etudiantService.update(etudiant) ;
     }



}
