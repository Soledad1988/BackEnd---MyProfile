
package com.miCurriculum.MyCv.service;

import com.miCurriculum.MyCv.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersona();
    public void crearPersona (Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void actualizar(Persona per);
}
