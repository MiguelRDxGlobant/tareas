
/**
 *
 * @author User
 */
public class ComputePI {

    public static void main(String[] args) {
        double precision = 0.0000001;
        ComputePI aComputePI = new ComputePI();
        double pi = aComputePI.getPI(precision);
        System.out.printf("Difference between the values obtained and the Math.PI: %.10f \n", (double)(Math.PI - pi));
    }
    
    /**
     * Compute PI value with precision.
     * 
     * @param double precision
     * @return double
     */
    private double getPI(double precision) {
        double sumOld;
        double sumNew = 0.0;
        long   i = 0;
        do {
            sumOld = sumNew;
            sumNew += ((i % 2 == 0) ? 1 : -1) * (double) 4/(2*i + 1); 
            ++i;
        } while( (double) Math.abs(sumNew - sumOld) >= precision);
        
        System.out.printf("Calculated items %d, PI = %.10f", i, sumOld);
        System.out.println();
        return sumOld;    
    }
    
}