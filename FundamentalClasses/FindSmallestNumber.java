import java.util.Scanner;


public class FindSmallestNumber {

	public static void main(String[] args) {
		System.out.println("Enter Sum and Number of digits");
		Scanner a = new Scanner (System.in);
		int sum = a.nextInt();
		int digits = a.nextInt();
		findSmallestNumber(sum, digits);
	}
	
	public static void findSmallestNumber(int s, int d){
		if(s==0){
			if(d==1){
				System.out.println("Number is"+ 0);
			}else{
				System.out.println("Output not possible");
			}
			return;
		}
		
		if(s>9*d){
			System.out.println("Number not possible");
			return;
		}
		
		 //s=s-1;
		 int []res = new int [d];
		
		 for(int i =d-1;i>=0;i--){
			 if(s>=9){
					res[i]=9;
					s-=9;
				}
			 else{
				 res[i] = s;
				 s=0;
			 }
		 }
		 
		 System.out.println("Number is: ");
		 for(int i=0;i<d;i++){
			 System.out.print(res[i]);
		 }
		
	}

}
