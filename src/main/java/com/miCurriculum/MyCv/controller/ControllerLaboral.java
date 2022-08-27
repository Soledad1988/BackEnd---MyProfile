
package com.miCurriculum.MyCv.controller;

import com.miCurriculum.MyCv.model.ExpLaboral;
import com.miCurriculum.MyCv.service.ILaboralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/laboral")
public class ControllerLaboral {
    @Autowired 
    private ILaboralService workServ;
    
    @PostMapping("") //trabajo/nuevo
    public void crearExpLaboral(@RequestBody ExpLaboral trabajo){
        workServ.crearExpLaboral(trabajo);
    }
    
    @GetMapping("")//trabajo/ver
    @ResponseBody
    public List<ExpLaboral> verExpLaboral (){
       return workServ.verExpLaboral();
    }
    
 
    @DeleteMapping("/{id}")
    public void borrarExpLaboral(@PathVariable Long id){
        workServ.borrarExpLaboral(id);
    }
    
    //obtiene
   @GetMapping("/{id}")
    public ExpLaboral get(@PathVariable("id") Long id){
       return workServ.buscarExpLaboral(id);
    }
    
    //actualizar
    @PutMapping("")
    public void actualizarExpLaboral(@RequestBody ExpLaboral trabajo){
       workServ.actualizar(trabajo);
    }
}
