
public class Exception1 {
/**
 * @param args
 */
public static void main(String args[]){
	try{
		printAverage(100,20);	
	}
	catch(ArithmeticException ae){
		ae.printStackTrace();
		System.out.println("Exception Handled in main");
	}
	System.out.println("Exiting main...");
}
public static void printAverage(int totalsum,int totalnumber){
	try{
		int average = computeAverage(totalsum,totalnumber);
		System.out.println("Average is:"+totalsum+"/"+totalnumber+"="+average);
	}catch(IllegalArgumentException il){
		il.printStackTrace();
		System.out.println("Exceptin handled in printAverage method");
	}
	System.out.println("Exiting from printAverage()...");	
}
public static int computeAverage(int total,int number) {
	System.out.println("Computing Average");
	return total/number;
}

}
