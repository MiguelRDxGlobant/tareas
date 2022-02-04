package topic1.ejercicio2;

import java.util.ArrayList;



public class Producto implements Observable {

    private String nombre;

    private double precio;

    public Producto(String nom, double pre){

        nombre = nom;

        precio = pre;

        observadores = new ArrayList<Observador>();

    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    private ArrayList<Observador> observadores;


    public void Suscribirse(){
        notificarSuscripcion();
    }

    public void Desuscribirse(){
        notificarDesuscripcion();
    }


    public void actPrecio(){
        notificarActPrecio();
        System.out.println(getPrecio());
    }

    public void enlazarObservador(Observador o) {
        observadores.add(o);
     };

    
    public void desenlazarObservador(Observador o) {
        observadores.remove(o);
    };


    @Override
    public void notificarSuscripcion() {
        for(Observador o: observadores) {
            o.update();
        }
    }


    @Override
    public void notificarActPrecio() {
        for(Observador o: observadores) {
            o.updatePrc();
        }
    }

    @Override
    public void notificarDesuscripcion() {
        for(Observador o: observadores) {
            o.updateDesuscripcion();
        }
    }
    
}
