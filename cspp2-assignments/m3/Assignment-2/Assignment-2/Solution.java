import java.util.Scanner;
/**
 *Do not modify this main function.
 *@author SandhyaKamisetty
 */
public final class Solution {
    /**
     * Fill the main function to print the number of 7's between 1 to n.
     */
    private Solution() {
    //We are not using this constructor.
    }
    /**
    * @variable TEN variable.
    */
    private static final int TEN = 10;
    /**
    *@variable SEVEN variable.
    */
    private static final int SEVEN = 7;
     /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int p = i;
            while (p != 0) {
                int k = p % TEN;
                p = p / TEN;
                if (k == SEVEN) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}



