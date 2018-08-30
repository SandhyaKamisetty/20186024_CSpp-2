import java.util.Scanner;
public class Average{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		float sum = 0;
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
			sum = sum + arr[i];
		}
		System.out.println(sum/n);
	}
}