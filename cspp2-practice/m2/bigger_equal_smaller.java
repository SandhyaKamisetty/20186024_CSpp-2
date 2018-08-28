import java.util.*;
public class bigger_equal_smaller{
	public static void main(String[] args){
		int varA;
		int varB;
		Scanner s = new Scanner(System.in);
		varA = s.nextInt();
		varB = s.nextInt();
		if(varA>varB){
			System.out.println("Bigger");
		}
		else if(varA<varB){
			System.out.println("Smaller");
		}
		else{
			System.out.println("Equal");
		}
	}
}