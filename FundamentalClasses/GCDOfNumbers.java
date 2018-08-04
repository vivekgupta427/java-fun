
public class GCDOfNumbers {
	public static void main(String [] args){
		int res = gcd(15,18);
		System.out.println("The GCD is "+res);
	}
	
	static int gcd(int a, int b){
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}
}
