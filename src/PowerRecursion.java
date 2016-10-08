/**
 * PowerRecursion using recursion get the value of any number to a given power.
 *
 * @author miqdadamirali
 * Github: https://github.com/miqdadamirali/simply-recursions
 */
public class PowerRecursion {

    /**
     * Main method
     */
    public static void main(String[] args) {
        System.out.println("Results: ");
        System.out.println("2^3: " + power(2, 3));
        System.out.println("4^3: " + power(4, 3));
        System.out.println("5^3: " + power(5, 3));
        System.out.println("8^6: " + power(8, 6));
    }

    /**
     * Get the value of a number to the power
     *
     * @param number The number
     * @param power  Power to calculate
     * @return
     */
    public static int power(int number, int power) {
        int y;
        if (power == 0)
            return 1;

        // Optimized
        y = power(number, power / 2);
        y *= y; // multiply y by itself
        return (power % 2 == 1) ? y *= number : y;

        // Version 1.0 - Incase optimized version is unclear,
        // uncomment the code below and comment the optimized code
        // to yield the same result;
//        if (power % 2 != 0) {   // If odd power
//            y = power(number, (power - 1) / 2);
//            return number * y * y;
//        } else {                // If even power
//            y = power(number, power / 2);
//            return y * y;
//        }

    }
}
