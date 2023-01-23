package java8.dateAndTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class Demo4
{
	public static void main(String[] args) 
	{

		LocalDate birthday=LocalDate.of(1998,06,21);
		LocalDate today=LocalDate.now();

		Period p=Period.between(birthday,today);
		System.out.printf("your age is%d year %d months and %d dayes",p.getYears(),p.getMonths(),p.getDays());
	}
}