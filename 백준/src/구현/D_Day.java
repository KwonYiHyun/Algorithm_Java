package 구현;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class D_Day {
	
	public static void main(String[] args) throws ParseException {
		Scanner scan=new Scanner(System.in);
		String day1=scan.nextLine();
		String day2=scan.nextLine();
		day1=day1.replace(' ', '/');
		day2=day2.replace(' ', '/');
		
		Date date1=new SimpleDateFormat("yyyy/MM/dd").parse(day1);
		Date date2=new SimpleDateFormat("yyyy/MM/dd").parse(day2);
		
		if (date1.compareTo(date2)>0) {
			
		}else {
			Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
			c.setTime(date1);
			c.add(Calendar.YEAR, 1000);
			Date dd=c.getTime();
			
			if(dd.compareTo(date2)>0) {
				long diffsec=(date2.getTime()-date1.getTime())/1000;
				long diffdays=diffsec/(24*60*60);
				System.out.println("D-"+diffdays);
			}else {
				System.out.println("gg");
			}
			
		}
	}
	
}
