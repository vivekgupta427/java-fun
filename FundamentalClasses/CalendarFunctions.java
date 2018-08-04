import java.util.Calendar;
import java.util.Date;


public class CalendarFunctions {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		System.out.println("Calendar is :"+ c1+"\n");
		System.out.println("Time zone is:" +c1.getTimeZone());
		
		Date d1 = c1.getTime();
		System.out.println("Date is:" + d1);
		
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH);
		int day = c1.get(Calendar.DAY_OF_MONTH);
		int hour = c1.get(Calendar.HOUR_OF_DAY);
		int min = c1.get(Calendar.MINUTE);
		int sec = c1.get(Calendar.SECOND);
		
		System.out.println("Today's Date is:" + year+"," +month +"," +day +","+hour +","+ min +","+ sec);
		
		Calendar c2 = (Calendar) c1.clone();
		c2.add(Calendar.DAY_OF_YEAR,-365);
		System.out.println("Before on year"+ c2.getTime());
	}
}
