
package com.miCurriculum.MyCv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private String institucion;
    private String periodo;
    private String imagen;
    
    //@ManyToOne
    //private Persona persona;

    public Proyecto() {
    }

    public Proyecto(Long id, String titulo, String descripcion, String institucion, String periodo, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.institucion = institucion;
        this.periodo = periodo;
        this.imagen = imagen;
    }
}
