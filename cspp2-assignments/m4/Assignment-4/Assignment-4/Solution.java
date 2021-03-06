/**
 * @author: SandhyaKamisetty.
 * Reverse of a string
 */
import java.util.Scanner;
/**
 * Class for solution.
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
        String string = s.nextLine();
        String reverse = reverseString(string);
        System.out.println(reverse);
    }

    /**
     * { function_description }.
     *
     * @param      string  The string
     *
     * @return     { description_of_the_return_value }
     */
    static String reverseString(final String string) {
        String str1 = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            str1 += string.charAt(i);
        }
        return str1;
    }
}
