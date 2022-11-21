package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.Interfaces.IDepartement;
import tn.spring.springboot.entities.Departement;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartementController {

    @Autowired
    IDepartement DepartementService ;
    @PostMapping("/add")
    @ResponseBody
    public void addDepartement(@RequestBody Departement d) {
        DepartementService.AjouterDepartement(d) ;
    }


    @GetMapping(value = "/get")
    @ResponseBody
    public List<Departement> getAllDE() {
         return  DepartementService.getAllD();
    }

}
