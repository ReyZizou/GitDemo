/**
 * 
 */
package es.aytos.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.aytos.demo.Departamento;
import es.aytos.demo.dao.IDepartamentoDao;

/**
 * @author arsenio.jimenez
 *
 */
@Service
public class DepartamentoService implements IDepartamentoService
{
  @Autowired
  private IDepartamentoDao departamentoDao;

  public List<Departamento> getDepartamentos(){
    return (List<Departamento>)departamentoDao.findAll();
  }
}
