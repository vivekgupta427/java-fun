import java.util.Scanner;
public class FibonaccySeries {
	public static void main(String [] args){
		System.out.println("Enter Number of terms");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		fibonaccy(x);
	}
	
	public static void fibonaccy(int num){
		int n1=1;
		int n2=1;
		int n3=0;
				
		System.out.print(n1+" "+n2);
		for(int i=0;i<num-2;i++){
			n3 = n1+n2;
			n2=n1;
			n1= n3;
			System.out.print(" "+n3);
			
		}
	}
}
