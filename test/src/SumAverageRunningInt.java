public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int  UPPERBOUND = 100;
        int number = LOWERBOUND;


        do{
            sum += number;
            ++number;
        } while( number <= UPPERBOUND );
        

        Double SumLoweUpper = Double.valueOf(LOWERBOUND + UPPERBOUND);

        Double divTwo = Double.valueOf(2);

        average = Double.valueOf(SumLoweUpper / divTwo);
        System.out.println(sum);  
        System.out.println(average);
    }
}
