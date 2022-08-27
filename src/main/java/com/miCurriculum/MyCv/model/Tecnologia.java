
package com.miCurriculum.MyCv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String avance;
    

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, String avance) {
        this.id = id;
        this.nombre = nombre;
        this.avance = avance;
    }
}
