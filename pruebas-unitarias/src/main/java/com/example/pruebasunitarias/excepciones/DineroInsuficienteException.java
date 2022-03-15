package com.example.pruebasunitarias.excepciones;

import java.io.Serial;

public class DineroInsuficienteException extends  RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public  DineroInsuficienteException(String mensaje){
        super(mensaje);
    }
}
