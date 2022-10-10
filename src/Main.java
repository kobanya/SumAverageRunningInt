/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class Main {   // Save as "SumAverageRunningInt.java"
    public static void main(String[] args) {
        // Define variables
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number;     // same as "sum = sum + number"
        }
        System.out.println("The sum of numbers " + LOWERBOUND +"-" +UPPERBOUND + " is : " + sum);
        System.out.println("A számok összege  " + LOWERBOUND +"-" +UPPERBOUND + " -ig  : " + sum);
        // Compute average in double. Beware that int / int produces int!
        //public static  double AtlagSzamitas (double num1, double num2); {
        double sum1;
        double atlag;
        sum1 = UPPERBOUND + LOWERBOUND;
        atlag = sum1 / 2;

        // Print sum and average
        System.out.println("------------------------------");
        System.out.println("The average is:   " + atlag);
        System.out.println("A számok átlaga :  " + atlag);

    }

}