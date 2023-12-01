
package com.miCurriculum.MyCv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity(name="Persona")
@Table(name="personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String sobreMi;
    private String pais;
    private String provincia;
    private String email;
    private String imagen;
  

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String profesion, String sobreMi, String pais, String provincia, String email, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.sobreMi = sobreMi;
        this.pais = pais;
        this.provincia = provincia;
        this.email = email;
        this.imagen = imagen;
    }
}
