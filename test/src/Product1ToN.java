public class Product1ToN {
    public static void main(String[] args) {


        int product = 1;
        final int LOWERBOUND = 1;
        int UPPERBOUND = 13;
        int number = LOWERBOUND;

        if(UPPERBOUND >= 13){
            Long UPPERBOUND2 = Long.valueOf(UPPERBOUND);
            while (product <= UPPERBOUND2){
                number = number * product;
                product++;
            }
            System.out.println("The product of " +  UPPERBOUND2 + " is " + number);
        } else {
            while (product <= UPPERBOUND){
                number = number * product;
                product++;
            }
            System.out.println("The product of " +  UPPERBOUND + " is " + number);
        }
    }
}
