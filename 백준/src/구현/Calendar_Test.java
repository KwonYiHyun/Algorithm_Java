package 구현;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Calendar_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"), Locale.KOREA);
		cal.set(2020, 2, 29);
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
