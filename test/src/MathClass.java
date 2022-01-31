import java.util.Scanner;

public class MathClass {
    
    public static void main(String[] args) {
        
        float number1;

        float number2;

        float div;

        int result;

        Scanner in = new Scanner(System.in);
        System.out.println("Put the first number: ");
        number1 = in.nextFloat();
        
        System.out.println("Put the second number: ");
        number2= in.nextFloat();

        in.close();

        div = number1 / number2;

        result = Math.round(div);

        System.out.println("El redondeo de " + div + " es " + result);
    }

    
}
