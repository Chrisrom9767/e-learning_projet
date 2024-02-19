package sn.esmt.elearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("etudiants")
public class EtudiantController {
  @GetMapping
  public List<String> getAll(){
    return List.of("samuel AISSI","Djamila MOUSSA","Tekyath AMOUSSA");
  }
  @GetMapping("/{prenom}")
  public String get(@PathVariable String prenom ){
    return prenom + "AISSI";
  }
  @PostMapping
  public String save(@RequestBody String personne){
    return personne;
  }
  @PutMapping
  public String update(@RequestBody String personne){
    return personne;
  }
}
