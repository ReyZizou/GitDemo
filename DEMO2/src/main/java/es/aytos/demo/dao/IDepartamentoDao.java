/**
 * 
 */
package es.aytos.demo.dao;

import org.springframework.data.repository.CrudRepository;

import es.aytos.demo.Departamento;

/**
 * @author arsenio.jimenez
 *
 */
public interface IDepartamentoDao extends CrudRepository<Departamento,Integer>
{

}
