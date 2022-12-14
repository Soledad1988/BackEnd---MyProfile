
package com.miCurriculum.MyCv.service;

import com.miCurriculum.MyCv.entity.Rol;
import com.miCurriculum.MyCv.enums.RolNombre;
import com.miCurriculum.MyCv.repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    } 
}
