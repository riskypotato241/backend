
package com.example.demo.Interface;

import com.example.demo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //trae persona
    public List<Persona> getPersona();
    //guarda persona
    public void savePersona(Persona persona) ;
    //buscar persona por id
    public Persona findPersona(Long id);
    //eliminar persona por id
    public void deletePersona(Long id);
}
