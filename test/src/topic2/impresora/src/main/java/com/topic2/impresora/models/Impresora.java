package com.topic2.impresora.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Impresora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Getter @Setter @Column(name = "marca")
    private String marca;

    @Getter @Setter @Column(name = "blancoYnegro")
    private String blancoYnegro;

    @Getter @Setter @Column(name = "color")
    private String color;

    public void imprimirAcolor() {
        System.out.println("Imprimiendo a color");
    }

    public void imprimirBlancoYNegro() {
        System.out.println("Imprimiendo a blanco y negro");
    }
}
