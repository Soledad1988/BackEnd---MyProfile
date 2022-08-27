
package com.miCurriculum.MyCv.controller;

import com.miCurriculum.MyCv.model.Tecnologia;
import com.miCurriculum.MyCv.service.ITecnologiaService;
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
@RequestMapping("/tecnologia")
public class ControllerTecnologia {
    @Autowired 
    private ITecnologiaService tecnoServ;
    
    @PostMapping("")
    public void crearTecnologia(@RequestBody Tecnologia tecnologia){
        tecnoServ.crearTecnologia( tecnologia);
    }
    
    @GetMapping("")
    @ResponseBody
    public List<Tecnologia> verTecnologia (){
       return tecnoServ.verTecnologia();
    }
    
 
    @DeleteMapping("/{id}")
    public void borrarExpLaboral(@PathVariable Long id){
        tecnoServ.borrarTecnologia(id);
    }
    
    //obtiene
   @GetMapping("/{id}")
    public Tecnologia get(@PathVariable("id") Long id){
       return tecnoServ.buscarTecnologia(id);
    }
    
    //actualizar
    @PutMapping("")
    public void actualizarTecnologia(@RequestBody Tecnologia  tecnologia){
       tecnoServ.actualizar( tecnologia);
    }
}
