
package com.miCurriculum.MyCv.repository;

import com.miCurriculum.MyCv.entity.Rol;
import com.miCurriculum.MyCv.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
