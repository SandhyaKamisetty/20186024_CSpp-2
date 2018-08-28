import java.util.Scanner;
public class area_of_Circle{
	public static void main(String[] args){
		int r;
		double pi = 3.14;
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		double area = pi * r *r;
		System.out.println(area);

	}
}