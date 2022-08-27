
package com.miCurriculum.MyCv.service;

import com.miCurriculum.MyCv.model.Proyecto;
import com.miCurriculum.MyCv.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
     @Autowired
    public ProyectoRepository proyeRepo;

    @Override
    public List<Proyecto> verProyecto() {
        return proyeRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizar(Proyecto proye) {
        proyeRepo.save(proye);
    }
}
