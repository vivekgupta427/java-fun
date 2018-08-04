import java.util.Scanner;
public class FactorialClass {
	public static void main(String[] args){
		System.out.println("Enter Number");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int factNumber = fact(x);
		System.out.println("The factorial of the number is "+ factNumber);
	}
	
	public static int fact(int num){
		int y=1;
		if(num==0){
			return 1;
		}
		else{
			while(num>0){
				y=y*num;
				num--;
			}
		}
		return y;	
	}
}
