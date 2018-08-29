import java.util.*;
/**
 *@author : SandhyaKamisetty
 */
public class SumOfNNumbers{
	
	public static void main(String[] args){
		int n;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i=1;i<=n;i++){
			sum = sum+i;
		}
		System.out.println(sum);
	}
}