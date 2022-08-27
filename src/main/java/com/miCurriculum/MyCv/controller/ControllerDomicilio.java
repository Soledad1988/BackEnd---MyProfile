
package com.miCurriculum.MyCv.controller;

import com.miCurriculum.MyCv.model.Domicilio;
import com.miCurriculum.MyCv.service.IDomicilioService;
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
@RequestMapping("/domicilio")
public class ControllerDomicilio {
    @Autowired 
    private IDomicilioService domServ;
    
    @PostMapping("")
    public void agregarDomicilio(@RequestBody Domicilio domicilio){
        domServ.crearDomicilio(domicilio);
    }
    
    @GetMapping("")
    @ResponseBody
    public List<Domicilio> verDomicilio (){
       return domServ.verDomicilio();
    }
    
     //obtiene
   @GetMapping("/{id}")
    public Domicilio get(@PathVariable("id") Long id){
       return domServ.buscarDomicilio(id);
    }
    
    @DeleteMapping("/{id}")
     void borrarDomicilio(@PathVariable Long id){
        domServ.borrarDomicilio(id);
    }
    
    
   @PutMapping("")
    public void actualizar(@RequestBody Domicilio domicilio){
        domServ.actualizar(domicilio);
    }
}
