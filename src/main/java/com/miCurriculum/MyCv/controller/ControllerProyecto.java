
package com.miCurriculum.MyCv.controller;

import com.miCurriculum.MyCv.model.Proyecto;
import com.miCurriculum.MyCv.service.IProyectoService;
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
@RequestMapping("/proyectos")
public class ControllerProyecto {
    @Autowired 
    private IProyectoService proyeServ;
    
    @PostMapping("")
    public void agregaProyecto(@RequestBody Proyecto proyecto){
        proyeServ.crearProyecto(proyecto);
    }
    
    @GetMapping("")
    @ResponseBody
    public List<Proyecto> verExpLaboral (){
       return proyeServ.verProyecto();
    }
    
    @DeleteMapping("/{id}")
    public void borrarExpLaboral(@PathVariable Long id){
        proyeServ.borrarProyecto(id);
    }
    
    //obtiene
   @GetMapping("/{id}")
    public Proyecto get(@PathVariable("id") Long id){
       return proyeServ.buscarProyecto(id);
    }
    
    //actualizar
    @PutMapping("")
    public void actualizaProyecto(@RequestBody Proyecto proyecto){
       proyeServ.actualizar(proyecto);
    }
}
