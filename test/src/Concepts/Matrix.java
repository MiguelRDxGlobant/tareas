package Concepts;

import javax.swing.JOptionPane;

public class Matrix {
    // ¿Que es? Estructura de datos que contiene una colección de valores del mismo tipo.

    // ¿Para qué? Para almacenar valores que normalmente tienen alguna relación entre si.

    // Declaración: int[] mi_matriz= new int[10];

    public static void main(String[] args) {
        

        // int [] mi_matriz = new int[5];
    
        // mi_matriz[0] = 5;
        // mi_matriz[1] = 6;
        // mi_matriz[2] = 9;
        // mi_matriz[3] = 1;
        // mi_matriz[3] = 3;

        // int [] mi_matriz={8, 6, 3, 6, 9};

        //  for (int i = 0; i < mi_matriz.length; i++){
        //      System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
        //  }

        // String [] paises ={"España", "México", "Colombia", "Perú", "Ecuador", "Venezuela"};

        // for (int i = 0; i < paises.length; i++){
        //     System.out.println("País " + (i + 1) + " " + paises[i]);
        // }

        // String [] paises = new String[8];

        // for(int i = 0; i < 8 ; i++){
        //     paises[i] = JOptionPane.showInputDialog("Introduce país" + (i+1));
        // }

        // for(String pais: paises){
        //     System.out.println(pais);
        // }

        int [] num_aleatorios = new int [150];

        for (int i = 0; i < num_aleatorios.length; i++){
            num_aleatorios[i] = (int) Math.round(Math.random()*100);
        }

        for(int numeros: num_aleatorios){
            System.out.print(numeros + " ");
        }
    }
}
