
package com.miCurriculum.MyCv.service;

import com.miCurriculum.MyCv.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    public List<Tecnologia> verTecnologia();
    public void crearTecnologia (Tecnologia tecno);
    public void borrarTecnologia(Long id);
    public Tecnologia buscarTecnologia(Long id);
    public void actualizar(Tecnologia tecno);
}
