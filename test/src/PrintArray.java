import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        
        String input;

        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce numero de items: ");

        int NUM_ITEMS = Integer.valueOf(scn.nextLine());

        String [] arreglo = new String[NUM_ITEMS];

        System.out.println("Introduce los valores: ");

        input = scn.nextLine();


        arreglo = input.split(" ");

        System.out.println(Arrays.toString(arreglo));

    }
    
}
