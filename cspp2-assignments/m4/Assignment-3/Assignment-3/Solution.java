/**
 * @author: SandhyaKamisetty.
 * Binary to decimal
 */

import java.util.Scanner;
/**
 * class Solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * unused constructor.
         */
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // sc.nextLine();
        for (int i = 0; i < n; i++) {
            String string = s.next();
            // System.out.println(s);
            String res = binaryToDecimal(string);
            System.out.println(res);
        }
    }
    /**
     * binary to decimal function.
     *
     * @param      string     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static String binaryToDecimal(final String string) {
        int base = 1;
        int sum = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            sum = sum + (base * Character.getNumericValue(string.charAt(i)));
            base *= 2;
        }

        return Integer.toString(sum);
    }


}
