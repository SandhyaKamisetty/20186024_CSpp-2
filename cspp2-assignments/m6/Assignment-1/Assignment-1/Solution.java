import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : SandhyaKamisetty
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
        Scanner scan = new Scanner(System.in);
        int temp;
        for (int i = 2; i < n; i++) {
            temp = i % 2;
            if (temp != 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    // write your code here
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}




