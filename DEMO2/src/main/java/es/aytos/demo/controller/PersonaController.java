/**
 * 
 */
package es.aytos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.aytos.demo.Persona;
import es.aytos.demo.service.IPersonaService;

/**
 * @author arsenio.jimenez
 *
 */
@RestController
public class PersonaController {

  @Autowired
  private IPersonaService personaService;

  @RequestMapping("/")
  public String index() {

    return "Hola. Mi proyecto está publicado";
  }

  @GetMapping("/personas")
  public List<Persona> getPersonas(){
    return personaService.getPersonas();
  }


}