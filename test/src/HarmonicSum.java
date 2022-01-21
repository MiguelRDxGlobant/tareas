public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;  // Use a more meaningful name instead of n
        double sumL2R = 0.0;         // Sum from left-to-right
        double sumR2L = 0.0;         // Sum from right-to-left
        double absDiff;              // Absolute difference between the two sums
        int number = 1;
   
      // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
          // denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
        Double numberDiv = Double.valueOf(number);
        Double denominatorDiv = Double.valueOf(denominator);

        sumL2R += numberDiv / denominatorDiv;
          // Beware that int/int gives int, e.g., 1/2 gives 0.
         }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        for (int denominator = 50000; denominator >= 1; --denominator) {
          Double numberDiv = Double.valueOf(number);
          Double denominatorDiv = Double.valueOf(denominator);
  
          sumR2L += numberDiv / denominatorDiv;
            // Beware that int/int gives int, e.g., 1/2 gives 0.
           }
          System.out.println("The sum from right-to-left- is: " + sumR2L);

      // Find the absolute difference and display
         if (sumL2R > sumR2L){
             absDiff = sumL2R - sumR2L;
         } else {
             absDiff = sumR2L - sumL2R;
         }
         System.out.println("The absolute difference of the sums is " + absDiff);
    }
}
