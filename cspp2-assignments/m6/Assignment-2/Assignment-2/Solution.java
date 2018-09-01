import java.util.Scanner;
/**
 * Write a java program to round the elements of a matrix to the nearest 100.
 *
 * @author     :
 */
final class Solution {
    /**.
        *Do not modify this main function.
    */
    public static final int A = 50;
    /**.
     *to check.
    */
    public static final int B = 100;
    /**.
     *to check.
    */
    public static final int C = 150;
    /**.
     *to check.
    */
    public static final int D = 200;
    /**.
     *to check.
    */
    public static final int E = 250;
    /**.
     *to check.
    */
    public static final int F = 300;
    /**.
     *to check.
    */
    public static final int G = 350;
    /**.
     *to check.
    */
    public static final int H = 400;
    /**.
     *to check.
    */
    public static final int I = 450;
    /**.
     *to check.
    */
    public static final int J = 500;
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a,
                                final int rows, final int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (a[i][j] < A) {
                    a[i][j] = 0;
                } else if (a[i][j] > A || a[i][j] < B) {
                    a[i][j] = B;
                } else if (a[i][j] > B) {
                    a[i][j] = D;
                } else if (a[i][j] > C || a[i][j] < D) {
                    a[i][j] = D;
                } else if (a[i][j] > D && a[i][j] < E) {
                    a[i][j] = D;
                } else if (a[i][j] > E || a[i][j] < F) {
                    a[i][j] = F;
                } else if (a[i][j] > F || a[i][j] < G) {
                    a[i][j] = F;
                } else if (a[i][j] > G || a[i][j] < H) {
                    a[i][j] = H;
                } else if (a[i][j] > H || a[i][j] < I) {
                    a[i][j] = H;
                } else if (a[i][j] > I || a[i][j] < H) {
                    a[i][j] = I;
                } else {
                    a[i][j] = J;
                }
            }
        } return a;


    // write ypur code here


    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
