import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : 
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
        int temp = 0;
        for (int i = 3; i < n; i++) {
            temp = i % 2;
            if (temp != 0) {
                temp = i;
                for (int j = 2; j < i; j++) {
                    if (temp % j == 0) {
                        System.out.println(temp);
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

