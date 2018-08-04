import java.util.Scanner;
public class PalindromNumber {
	public static void main(String [] args){
		System.out.println("Enter Number");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int temp = x;
		int sum=0;
		while(temp>0){
			int b = temp%10;
			sum = (sum*10)+b;
			temp = temp/10;	
		}
		if(sum==x){
			System.out.println("Number is Palindrom");
		}
		else{
			System.out.println("Number is not Palindrom");
		}
	}
	
}
