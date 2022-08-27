
package com.miCurriculum.MyCv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private String provincia;
    private String codigo_postal;
    private String pais;

    public Domicilio() {
    }

    public Domicilio(Long id, String calle, String provincia, String codigo_postal, String pais) {
        this.id = id;
        this.calle = calle;
        this.provincia = provincia;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
    }
}
