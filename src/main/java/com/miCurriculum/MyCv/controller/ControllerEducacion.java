
package com.miCurriculum.MyCv.controller;

import com.miCurriculum.MyCv.model.Educacion;
import com.miCurriculum.MyCv.service.IEducacionService;
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
@RequestMapping("/educacion")
public class ControllerEducacion {
    @Autowired 
    private IEducacionService eduServ;
    
    @PostMapping("")
    public void agregaEducacion(@RequestBody Educacion educacion){
        eduServ.crearEducacion(educacion);
    }
    
    @GetMapping("")
    @ResponseBody
    public List<Educacion> verEducacion (){
       return eduServ.verEducacion();
    }
    
    @DeleteMapping("/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    //obtiene
   @GetMapping("/{id}")
    public Educacion get(@PathVariable("id") Long id){
       return eduServ.buscarEducacion(id);
    }
    
    //actualizar
    @PutMapping("")
    public void actualizarEducacion(@RequestBody Educacion educacion){
       eduServ.actualizar(educacion);
    }
}
