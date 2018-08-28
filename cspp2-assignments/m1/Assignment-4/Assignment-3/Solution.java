/**.
 * author : SandhyaKamisetty.
 * date : 27/8/18
 */
import java.util.Scanner;
/**.
    * scanner function for taking user inputs
*/
public final class Solution {
	/**.
	    *Do not modify this main function.
	*/
	public static final int N_U_M_B_E_R = 5 ;
	/**.
		this is to calculate fahrenheit using celsius
	*/
	public static final int N_U_M = 9;
	/**.
		this is to calculate fahrenheit using celsius
	*/
	public static final int N_O = 32;
	/**.
		this is to calculate fahrenheit using celsius
	*/
	private Solution(){
		//constructor
	} 
	/**.
		* @param args of type string : command line arguments
	*/
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		double fahrenheit;
		double degreesCelsius = scan.nextDouble();

		System.out.println(calculateFromDegreesToFarenheit(degreesCelsius));
	}
	/**
	Need to fill the calculateFromDegreesToFarenheit function and print the output
	of fahrenheit.
	*@return float
	/**
	* this is comment of function
	* @param c **this is to calculate farenheit using celsius**
	*/
	public static double calculateFromDegreesToFarenheit(final double degreesCelsius){
	/**.
	function
	*/
		return (degreesCelsius * N_U_M_B_E_R / N_U_M) + N_O;
	}
}
