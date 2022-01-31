package poo;

import java.util.*;

public class Uso_empleado {
    public static void main(String[] args) {

        // Empleado empleado1 = new Empleado("Miguel Rojas", 1300, 2021, 12, 29);

        // Empleado empleado2 = new Empleado("Jesus Rodriguez", 1300, 2021, 12, 25);

        // Empleado empleado3 = new Empleado("Alberto Gomez", 1500, 2019, 10, 15);

        // empleado1.subeSueldo(5);

        // empleado2.subeSueldo(5);

        // empleado3.subeSueldo(5);

        // System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() + " Fecha de Alta: " + empleado1.getAltaContrata());

        // System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() + " Fecha de Alta: " + empleado2.getAltaContrata());

        // System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() + " Fecha de Alta: " + empleado3.getAltaContrata());
        
        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Miguel Rojas", 1300, 2021, 12, 29);

        misEmpleados[1] = new Empleado("Jesus Rodriguez", 1300, 2021, 12, 25);
        
        misEmpleados[2] = new Empleado("Alberto Gomez", 1500, 2019, 10, 15);

        // for (int i = 0 ; i < 3 ; i++){
        //     misEmpleados[i].subeSueldo(5);
        // }

        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }

        // for (int i = 0 ; i < 3 ; i++){
        //     System.out.println("Nombre: " + misEmpleados[i].getNombre() + " Sueldo: " + misEmpleados[i].getSueldo() + " Fecha de contrata: " + misEmpleados[i].getAltaContrata());
        // }

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + " Fecha de contrata: " + e.getAltaContrata());
        }

    }

    
}

class Empleado {
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){

        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

        altaContrato = calendario.getTime();


    } 

    public String getNombre(){
        return nombre;
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

    private String nombre;

    private Double sueldo;

    private Date altaContrato;
}