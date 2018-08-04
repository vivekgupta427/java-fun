
public class AdditionNumbers {
	public static void main(String [] args){
		int sum = sum(14,-5);
		System.out.println("Sum is "+sum);
	}
	
	static int sum(int a, int b){
		int s=0;int c=0;
		if(b==0){
			return a;
		}else{
			s= a^b;
			c=(a&b)<<1;
			return sum(s,c);
		}
	}
}
