package topic1.ejercicio3;

public class PerritoBasico implements PerritoCaliente {

    private  String nombre;

    public PerritoBasico(String nom) {

        nombre = nom;
        
    }
    
    @Override
    public void ponerPan() {
        System.out.println("Abriendo y poniendo el pan");
    }

    @Override
    public void ponerSalchicha() {
        System.out.println("Poniendo la salchicha");
    }

}
