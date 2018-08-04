import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFromString {
	public static void main(String[] args) {
		Date d1 = null;
		String dateInString = "12/13/2015" ; 
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy") ;
		try{
			d1 = df.parse(dateInString);
		}catch(ParseException e){
			System.out.println("Parsing Exception caught");
		}
		
		System.out.println("Converted Date is:" + df.format(d1));
		
		
	}
}
