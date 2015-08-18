import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class SimpleDateFormatDemo {

	public static void main(String args[]) {
	Date date = new Date();
	SimpleDateFormat sdf;
	sdf = new SimpleDateFormat("hh:mm:ss");
	System.out.println(sdf.format(date));
	sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
	System.out.println(sdf.format(date));
	sdf = new SimpleDateFormat("E MMM dd yyyy");
	System.out.println(sdf.format(date));
	
	String startDate = "2012-12-31 16:30";
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	try {
		Date startDate1 = df.parse(startDate);
		Calendar cal=GregorianCalendar.getInstance();
		cal.setTime(startDate1);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		String selDateString="now.dateIn('"+cal.get(Calendar.DATE)+"."+(cal.get(Calendar.MONTH)+1)+"')";
		System.out.println(selDateString);
		
		
		//System.out.println("date  "+startDate1.getDate());
		//System.out.println("month  "+startDate1.getMonth());
		//System.out.println("year  "+startDate1.getYear());
		//System.out.println("minute  "+startDate1.getMinutes());
		//System.out.println("hr  "+startDate1.getHours());
		//System.out.println("seconds  "+startDate1.getSeconds());
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	} 

}
