package poo;

public class pruebas {
    public static void main(String[] args) {
        
        Empleados trabajador1 = new Empleados("Miguel");

        Empleados trabajador2 = new Empleados("Juan");

        Empleados trabajador3 = new Empleados("Leo");


        trabajador1.CambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos());
        
        System.out.println(Empleados.dameIdSiguiente());

    }
    

}


class Empleados{

    public Empleados(String nom){

        nombre = nom;

        seccion = "Administración";

        Id = IdNext;

        IdNext++;

    }

    public void CambiaSeccion(String seccion){
        this.seccion = seccion;

    }

    public static String dameIdSiguiente(){

        return "El Id siguiente es: " + IdNext;

    }

    public String devuelveDatos(){

        return "El nombre es: " + nombre + " y la sección es " + seccion + " el Id es " + Id;

    }

    private final String nombre;

    private String seccion;

    private int Id;

    private static int IdNext = 1;
}