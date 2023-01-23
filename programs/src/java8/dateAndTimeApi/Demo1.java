package java8.dateAndTimeApi;

import java.time.LocalDate;

public class Demo1
{
	public static void main(String[] args) {
		
		/*LocalTime time=LocalTime.now();
		System.out.println(time);*/

		LocalDate date=LocalDate.now();
		System.out.println(date);

		int dd=date.getDayOfMonth();

		int mm=date.getMonthValue();

		int yyyy=date.getYear();

		System.out.println(dd+" "+mm+" "+yyyy);
		System.out.printf("%d,%d,%d",dd,mm,yyyy);

	}
}