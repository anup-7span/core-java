package java8.Supplier;

import java.util.Date;
import java.util.function.Supplier;

class DateDemo
{
	public static void main(String[] args) {
		
		Supplier<Date>s=()->new Date();
		System.out.println(s.get());
	}
}