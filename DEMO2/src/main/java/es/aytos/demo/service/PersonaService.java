/**
 * 
 */
package es.aytos.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.aytos.demo.Persona;
import es.aytos.demo.dao.IPersonaDao;

/**
 * @author arsenio.jimenez
 *
 */
@Service
public class PersonaService implements IPersonaService
{
  @Autowired
  private IPersonaDao personaDao;

  public List<Persona> getPersonas(){
    return (List<Persona>)personaDao.findAll();
  }
}
