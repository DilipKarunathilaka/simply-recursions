/**
 * Getting the Oddanacci value of a given number using Recursion.
 *
 * @author miqdadamirali
 * Github: https://github.com/miqdadamirali/simply-recursions
 */
public class OddonacciRecursion {

    public static final int sequence = 25;

    public static int[] array = {1, 1, 1};

    /**
     * Main method
     */
    public static void main(String[] args) {

        // Instantiate variables
        long before, after;
        int result;
        int[] linear;

        System.out.println("Results of sequence: " + sequence + "\n");

        // Oddonacci Recursion
        before = System.currentTimeMillis();
        result = oddonacci(sequence);
        after = System.currentTimeMillis();

        System.out.println("Oddonacci Recursion: " + result + " \nExecution time: "
                + (after - before) + " Milliseconds \n");

        // Linear Oddonacci Recursion
        before = System.currentTimeMillis();
        linear = linearOddonacci(sequence);
        after = System.currentTimeMillis();

        System.out.println("Linear Oddonacci Recursion: " + linear[2] + " \nExecution time: "
                + (after - before) + " Milliseconds \n");

        // Tail Linear Oddonacci Recursion
        before = System.currentTimeMillis();
        linear = taillinearOddonacci(sequence);
        after = System.currentTimeMillis();

        System.out.println("Tail Linear Oddonacci Recursion: " + linear[2] + " \nExecution time: "
                + (after - before) + " Milliseconds");
    }

    /**
     * Calculating the oddonacci recursively for an n index position
     *
     * @param n The index position
     * @return The oddonacci value at the received index
     */
    public static int oddonacci(int n) {
        if (n <= 3)
            return 1;

        return oddonacci(n - 1) + oddonacci(n - 2) + oddonacci(n - 3);
    }

    /**
     * This tail linear recursion invokes itself once as the very last statement.
     *
     * @param n The index position
     * @return An array with the third index position as the result.
     */
    public static int[] taillinearOddonacci(int n) {
        if (n <= 3)
            return array;

        int temp = array[0];
        array[0] = array[1];
        array[1] = array[2];
        array[2] = temp + array[0] + array[1];

        return taillinearOddonacci(n - 1);
    }

    /**
     * This linear recursion invokes itself once. This is not a tail recursion as the very last statement is not a
     * method call to itself.
     *
     * @param n The index position
     * @return An array with the third index position as the result.
     */
    public static int[] linearOddonacci(int n) {
        int temp;
        int[] array;

        if (n <= 3) {
            return new int[]{1, 1, 1};
        }

        array = linearOddonacci(n - 1);

        temp = array[0];
        array[0] = array[1];
        array[1] = array[2];
        array[2] = temp + array[0] + array[1];

        return array;
    }

}
