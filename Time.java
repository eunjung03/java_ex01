import java.util.*;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long t = System.currentTimeMillis();
		Date now = new Date();	//now = new Date(t);
		Calendar cal = new GregorianCalendar();
		
		System.out.println(t);
		System.out.println(now);
		System.out.println(cal.get(Calendar.YEAR)+"�� "
				           +(cal.get(Calendar.MONTH)+1)+"�� " 
        					+cal.get(Calendar.DAY_OF_MONTH)+"�� " 
        					+cal.get(Calendar.HOUR_OF_DAY)+":" 
        					+cal.get(Calendar.MINUTE)+":" 
        							+cal.get(Calendar.SECOND));
        		
	}

}
