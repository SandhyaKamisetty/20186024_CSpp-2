public class Pattern{
	public static void main(String[] args){
		int n = 5,num;
		for(int i=1;i<=n;i++){
			num=1;
			for(int j=1;j<=i;j++){
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
}