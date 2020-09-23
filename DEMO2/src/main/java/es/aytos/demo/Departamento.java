/**
 * 
 */
package es.aytos.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento {
  @Id
  @GeneratedValue
  private Long id;
  private String nombre;
  private String descripcion;
  
  @OneToOne
  private Persona responsable;
  
  @OneToMany
  private List<Persona> empleados;
  
  public Long getId()
  {
    return id;
  }
  public void setId(Long id)
  {
    this.id = id;
  }
  public String getNombre()
  {
    return nombre;
  }
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  public Persona getResponsable()
  {
    return responsable;
  }
  public void setResponsable(Persona responsable)
  {
    this.responsable = responsable;
  }
  public List<Persona> getEmpleados()
  {
    return empleados;
  }
  public void setEmpleados(List<Persona> empleados)
  {
    this.empleados = empleados;
  }
  /**
   * @return the descripcion
   */
  public String getDescripcion()
  {
    return descripcion;
  }
  /**
   * @param descripcion the descripcion to set
   */
  public void setDescripcion(String descripcion)
  {
    this.descripcion = descripcion;
  }
}
