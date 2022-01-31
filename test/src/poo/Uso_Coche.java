package poo;

import javax.swing.*;

public class Uso_Coche {

    public static void main(String[] args) {
        
        Coche Renault = new Coche();  // Instanciando una clase ejemplar de clase

        Renault.setColor(JOptionPane.showInputDialog("Introduce color"));

        Renault.setAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));

        Renault.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));

        System.out.println(Renault.getAsientos());

        System.out.println(Renault.getColor());

        System.out.println(Renault.getDataCoche());

        System.out.println(Renault.getClimatizador());

        System.out.println(Renault.getPesoCoche());

         
        System.out.println("El precio final del coche es " + Renault.precio_coche());


    }
    
}
