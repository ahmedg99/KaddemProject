package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.Interfaces.IEquipeService;
import tn.spring.springboot.entities.Equipe;

import java.util.List;

@RestController
@RequestMapping("/Equipes")
public class EquipeController {
    @Autowired
      IEquipeService equipeService;
/*
    @PostMapping("/add")
    @ResponseBody
    public void addEquipe(@RequestBody Equipe E ) {
        System.out.println(E);
         equipeService.AjouterEquipe(E) ;

    }
    */

    @GetMapping("/")
    public String sayHello() {
        return "Hello world" ;
    }
    @PostMapping (value = "/add")
    @ResponseBody
    public void  addProducts(    @RequestBody Equipe p) {
        equipeService.AjouterEquipe(p) ;
    }


    @GetMapping(value = "/getAllEquipes")
    @ResponseBody
    public List<Equipe> getAllEquipes() {
        return   equipeService.getAllEquipe();
    }





    @GetMapping(value = "/retrieveById/{id}")
    @ResponseBody
    public Equipe  getAllEquipes(@PathVariable("id") Long id) {
        return   equipeService.getEquipeById(id);
    }


}
