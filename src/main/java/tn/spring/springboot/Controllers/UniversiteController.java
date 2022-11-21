package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.Interfaces.IUniversity;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.entities.Universite;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/University")
public class UniversiteController {

    @Autowired
    IUniversity iUniversity ;



    @PostMapping(value = "/add")
    @ResponseBody
    public void  addUniversity(   @RequestBody Universite u) {
        iUniversity.AjoutUniversity(u);
    }


    @GetMapping(value = "/get")
    @ResponseBody
    public List<Universite> getAllUniversites() {
         iUniversity.getAllDepartments(2L);
        return iUniversity.getAllUniversities();
    }


    @PutMapping(value = "/univtodepar/{idUniversite}/{idDepartement}")
    @ResponseBody
    public void univtodepar(@PathVariable("idUniversite") Long idUniversite ,@PathVariable("idDepartement") Long idDepartement ) {
        iUniversity.assignUniversiteToDepartement(idUniversite,idDepartement);
    }

    @GetMapping(value = "/getdepartbyunivid/{idUniversite}")
    @ResponseBody
    public Set<Departement> getAlldepartbyunivid(@PathVariable("idUniversite") Long idUniversite) {
        return iUniversity.getAllDepartments(idUniversite);
    }


}
