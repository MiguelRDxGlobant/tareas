package poo;

// import javax.swing.*;

public class Uso_Vehiculo {

    public static void main(String[] args) {
        
        // Coche Renault = new Coche();  // Instanciando una clase ejemplar de clase

        // Renault.setColor(JOptionPane.showInputDialog("Introduce color"));

        // Renault.setAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));

        // Renault.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));

        // System.out.println(Renault.getAsientos());

        // System.out.println(Renault.getColor());

        // System.out.println(Renault.getDataCoche());

        // System.out.println(Renault.getClimatizador());

        // System.out.println(Renault.getPesoCoche());

         
        // System.out.println("El precio final del coche es " + Renault.precio_coche());


        Coche miCoche1 = new Coche();

        miCoche1.setColor("Rojo");

        Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

        miFurgoneta1.setColor("Azul");

        miFurgoneta1.setAsientos("si");

        miFurgoneta1.setClimatizador("si");

        System.out.println(miCoche1.getDataCoche() + " " + miCoche1.getColor());

        System.out.println(miFurgoneta1.getDataCoche() + " " + miFurgoneta1.getDatosFurgoneta());

    }
    
}
