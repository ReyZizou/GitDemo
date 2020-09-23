/**
 * 
 */
package es.aytos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.aytos.demo.Departamento;
import es.aytos.demo.service.IDepartamentoService;

/**
 * @author arsenio.jimenez
 *
 */
@RestController
public class DepartamentoController {

  @Autowired
  private IDepartamentoService departamentoService;

  @GetMapping("/departamentos")
  public List<Departamento> getPersonas(){
    return departamentoService.getDepartamentos();
  }
}