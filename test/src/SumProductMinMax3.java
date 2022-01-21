import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        
        int number1, number2, number3;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce the first number: ");
        number1 = in.nextInt();

        System.out.println("Introduce the second number: ");
        number2 = in.nextInt();

        System.out.print("Introduce the third number: ");
        number3 = in.nextInt();

        in.close();

        int sum = number1 + number2 + number3;

        int product = number1 * number2 * number3;

        int maxNumber = number1;

        
        if (number2 > maxNumber){

             maxNumber = number2;

        } 
        
        if (number3 > maxNumber) {

            maxNumber = number3;

        }

        int minNumber = number1;

        if (minNumber > number2){

            minNumber = number2;

        }
        
        if (minNumber > number3) {

            minNumber = number3;
            
        }


        System.out.println("The sum of the numbers is: " + sum);

        System.out.println("The product of the numbers is: " + product);

        System.out.println("The min of the numbers is: " + minNumber);

        System.out.println("The max of the numbers is: " + maxNumber);

    }
}
