package tn.spring.springboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Services.Interfaces.IDetailEquipe;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.DetailEquipe;

import java.util.List;

@RestController
@RequestMapping("/DetailEquipe")
public class DetailEquipeController {


    @Autowired
    IDetailEquipe iDetailEquipe ;


    @PostMapping("/add")
    @ResponseBody
    public void addDetailEquipe(@RequestBody DetailEquipe D) {
        iDetailEquipe.AjouterDetailEquipe(D);
    }



    @GetMapping("/DetailEquipes")
    public List<DetailEquipe> getAllDE() {
        return  iDetailEquipe.getAllDE();
    }


}
