package poo;

import java.util.*;

public class Uso_Persona {

    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado2("Juan Alonso", 50000, 2009, 02 , 25 );

        lasPersonas[1] = new Alumno("Hector Fernando", "Medicina");

        for (Persona e: lasPersonas){
            System.out.println(e.dameNombre() + ", " + e.dameDescripcion());
        }

        
    }
    
}

abstract class Persona {

    public Persona(String nom){

        nombre = nom;

    }

    public String dameNombre(){

        return nombre;

    }

    public abstract String dameDescripcion();

    private String nombre;

}

class Empleado2  extends Persona {
    
    public Empleado2(String nom, double sue, int agno, int mes, int dia){

        super(nom);

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

        altaContrato = calendario.getTime();


    } 

    public String dameDescripcion(){

        return "Este empleado tiene un sueldo de " + sueldo;
    }
    

    public Double getSueldo(){
        return sueldo;
    }

    public Date getAltaContrata(){
        return altaContrato;
    }

    public void subeSueldo(double porcentaje){

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }


    private Double sueldo;

    private Date altaContrato;
}

class Alumno extends Persona {

    public Alumno(String nom, String car){

        super(nom);

        carrera = car;

    }

    public String dameDescripcion(){

        return "Este alumno está estudiando la carrera de " + carrera;

    }

    private String carrera;

}