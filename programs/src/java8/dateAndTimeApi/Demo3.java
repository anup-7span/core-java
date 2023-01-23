package java8.dateAndTimeApi;

import java.time.LocalDateTime;

public class Demo3
{
	public static void main(String[] args) 
	{

		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);

		int dd=dt.getDayOfMonth();

		int mm=dt.getMonthValue();

		int yyyy=dt.getYear();

		System.out.printf("%d-%d-%d",dd,mm,yyyy);

		int h=dt.getHour();
		int m=dt.getMinute();
		int s=dt.getSecond();
		int n=dt.getNano();

		System.out.printf("\n%d:%d:%d:%d",h,m,s,n);

		System.out.println();


		LocalDateTime dt1=LocalDateTime.of(1998,06,21,10,34);
		System.out.println(dt1);

		System.out.println("After six months:-"+dt1.plusMonths(6));
		System.out.println("Befor six months:-"+dt1.minusMonths(6));
	}
}