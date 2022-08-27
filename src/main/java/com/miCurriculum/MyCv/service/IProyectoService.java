
package com.miCurriculum.MyCv.service;

import com.miCurriculum.MyCv.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto> verProyecto();
    public void crearProyecto (Proyecto proye);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);
    public void actualizar(Proyecto proye);
}
