package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.Interfaces.IUniversity;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.entities.Universite;

import java.util.List;

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
        return iUniversity.getAllUniversities();
    }




}
