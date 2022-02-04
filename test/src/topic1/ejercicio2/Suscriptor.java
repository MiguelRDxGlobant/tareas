package topic1.ejercicio2;

public class Suscriptor implements Observador {

    private String nombre;

    public Suscriptor(String nom) {

        nombre = nom;

    }

    public String getNombre() {
        return nombre;
    }

@Override
public void update() {
    System.out.println("Te suscribiste con exito!");
}

@Override
public void updatePrc() {
    System.out.println("El precio del producto suscrito es de:");
}

@Override
public void updateDesuscripcion() {
    System.out.println("Te has desuscrito con exito.");
}
    
}
