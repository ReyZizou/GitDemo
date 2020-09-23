/**
 * 
 */
package es.aytos.demo.dao;

import org.springframework.data.repository.CrudRepository;

import es.aytos.demo.Persona;

/**
 * @author arsenio.jimenez
 *
 */
public interface IPersonaDao extends CrudRepository<Persona,Integer>
{

}
