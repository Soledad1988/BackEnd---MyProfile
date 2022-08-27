
package com.miCurriculum.MyCv.repository;

import com.miCurriculum.MyCv.model.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboralRepository extends JpaRepository <ExpLaboral, Long>{
    
}
