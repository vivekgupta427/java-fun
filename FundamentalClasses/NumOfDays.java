import java.util.Calendar;
import java.util.Date;


public class NumOfDays {
	public static void main(String [] args){
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2015, 12, 13);
		Calendar c2 = Calendar.getInstance();
		c2.set(2016, 12, 13);
		
		Date d1 = c1.getTime();
		Date d2 = c2.getTime();
		
		long timeInMills = d2.getTime() - d1.getTime();
		
		int noOfDays = (int) (timeInMills/(1000*60*60*24));
		
		System.out.println("Number of Days :"+ noOfDays);
	}
}
