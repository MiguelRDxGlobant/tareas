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

        Jefatura jefe_RRHH = new Jefatura("Javier", 55000, 2020, 7, 15);

        jefe_RRHH.estableceIncentivo(2570);
        
        Empleado[] misEmpleados = new Empleado[5];

        misEmpleados[0] = new Empleado("Miguel Rojas", 1300, 2021, 12, 29);

        misEmpleados[1] = new Empleado("Jesus Rodriguez", 1300, 2021, 12, 25);
        
        misEmpleados[2] = new Empleado("Alberto Gomez", 1500, 2019, 10, 15);

        misEmpleados[3] = jefe_RRHH; // Polimorfismo en acción. Principio de sustitución

        misEmpleados[4] = new Jefatura("María", 95000, 20012, 5, 29);

       System.out.println(jefe_RRHH.tomar_decisiones("Dar más días de vacaciones a los empleados"));

       System.out.println("El jefe " + jefe_RRHH.getNombre() + " tiene un bonus de: " + jefe_RRHH.establece_bonus(500)); 

       System.out.println("El empleado " + misEmpleados[2].getNombre() + " tiene un bonus de: " + misEmpleados[2].establece_bonus(200));

        // for (int i = 0 ; i < 3 ; i++){
        //     misEmpleados[i].subeSueldo(5);
        // }

        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }

        // for (int i = 0 ; i < 3 ; i++){
        //     System.out.println("Nombre: " + misEmpleados[i].getNombre() + " Sueldo: " + misEmpleados[i].getSueldo() + " Fecha de contrata: " + misEmpleados[i].getAltaContrata());
        // }

        Arrays.sort(misEmpleados);

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + " Fecha de contrata: " + e.getAltaContrata());
        }

    }

    
}

class Empleado implements Comparable, Trabajadores {
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){

        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

        altaContrato = calendario.getTime();


    } 

    public double establece_bonus(double gratificacion){

        return Trabajadores.bonus_base + gratificacion;

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

    public int compareTo(Object miObjeto){

        Empleado otroEmpleado = (Empleado) miObjeto;

        if (this.sueldo < otroEmpleado.sueldo){
            return -1;
        }

        if (this.sueldo > otroEmpleado.sueldo){
            return 1;
        }

        return 0;
        
    }

    private String nombre;

    private Double sueldo;

    private Date altaContrato;
}

class Jefatura extends Empleado implements Jefes {

    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        
        super(nom, sue, agno, mes, dia);

    }

    public String tomar_decisiones(String decision){
        return "Un miembro de la dirección ha tomado la decisión de: " + decision;
    }

    public double establece_bonus(double gratificacion){

        double prima = 2000;

        return Trabajadores.bonus_base + gratificacion + prima;
    }

    public void estableceIncentivo(double b){

        incentivo = b;
    }

    public Double getSueldo(){

        Double sueldoJefe = super.getSueldo();

        return sueldoJefe + incentivo;
    }

    private double incentivo;

}



