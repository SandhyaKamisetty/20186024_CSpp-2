import java.util.Scanner;
class swap
{
	public static void main(String args[])
	{
		int x,y,temp;
		System.out.println("Enter x and y");
		Scanner Ip = new Scanner(System.in);
		x = Ip.nextInt();
		y = Ip.nextInt();
		temp = x;
		x = y;
		y = temp;
		System.out.println("x" + "=" + x);
		System.out.println("y" + "="+ y);
	}
}