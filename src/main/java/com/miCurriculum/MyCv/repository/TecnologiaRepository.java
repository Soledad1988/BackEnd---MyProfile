
package com.miCurriculum.MyCv.repository;

import com.miCurriculum.MyCv.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia, Long>{
    
}
