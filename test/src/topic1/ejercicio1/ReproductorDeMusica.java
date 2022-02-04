package topic1.ejercicio1;

import java.util.Scanner;

public class ReproductorDeMusica {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        System.out.println("Creando reproductor de Música personalizado");

        System.out.println("Elige uno de los dos colores disponibles: -verde / -azul");

        String inputColor = String.valueOf(scn.nextLine());

        System.out.println("Introduce únicamente el numero de las capacidades de memoria disponibles: 8 / 16 (GB)");

        int inputCapacidad = Integer.valueOf(scn.nextLine());

        System.out.println("Elige una capacidad de bateria introduciendo unicamente el numero de horas: 5 / 8 (horas)");

        int inputBateria = Integer.valueOf(scn.nextLine());

        FabricaReproductor reproductor1 = new FabricaReproductor(inputColor, inputCapacidad, inputBateria);

        reproductor1.eligeColor(inputColor);

        reproductor1.eligeCapacidad(inputCapacidad);

        reproductor1.eligeBateria(inputBateria);

        System.out.println("El reproductor personalizado que compraste es de color: " + reproductor1.getColor() + " tiene una capacidad de: " + reproductor1.getCapacidad() + "GB y tiene una duración de batería de: " + reproductor1.getBateria()+ " horas.");
        
    }

}

class FabricaReproductor implements InterfaceReproductor {

    private String color;

    private int capacidad;

    private int bateria;



    public FabricaReproductor(String col, int cap, int bat){

        color = col;

        capacidad = cap;

        bateria = bat;

    }

    public String getColor(){
        return color;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public int getBateria(){
        return bateria;
    }

    public String eligeColor(String color){
        return "El reproductor es de color: " + color;
    }

    public String eligeCapacidad(int capacidad){
        return "La capacidad del reproductor es de: " + capacidad + "GB";
    }

    public String eligeBateria(int bateria){
        return "La capacidad del reproductor es de: " + bateria + "GB";
    }
}