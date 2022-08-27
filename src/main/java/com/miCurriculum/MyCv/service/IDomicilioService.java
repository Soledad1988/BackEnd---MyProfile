
package com.miCurriculum.MyCv.service;

import com.miCurriculum.MyCv.model.Domicilio;
import java.util.List;


public interface IDomicilioService {
    public List<Domicilio> verDomicilio();
    public void crearDomicilio(Domicilio dom);
    public void borrarDomicilio(Long id);
    public Domicilio buscarDomicilio(Long id);
    public void actualizar(Domicilio dom);
}
