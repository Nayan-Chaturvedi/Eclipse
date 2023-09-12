package API;

import java.time.LocalDate;
import java.time.LocalTime;

public class Joda_Time_API {

	public static void main(String[] args)
	{
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		int date =ld.getDayOfMonth();
		int month=ld.getMonthValue();
		int year=ld.getYear();
		
		System.out.println("Date :" + date + " month :" +month +" year :" +year);
		
		System.out.println();
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		int hour=lt.getHour();
		int minute=lt.getMinute();
		int second=lt.getSecond();
		
		System.out.println("Hour :" +hour +" minute :" +minute +" second :" +second);
		
		

	}

}
