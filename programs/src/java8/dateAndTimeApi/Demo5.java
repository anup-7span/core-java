package java8.dateAndTimeApi;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Demo5
{
	public static void main(String[] args) 
	{
		/*ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);

		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt=ZonedDateTime.now(la);
		System.out.println(zt);*/
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
		String inputString1 = "23 01 1997";
		String inputString2 = "27 04 1997";

		LocalDateTime date1 = LocalDate.parse(inputString1, dtf).atStartOfDay();
		LocalDateTime date2 = LocalDate.parse(inputString2, dtf).atStartOfDay();
		long daysBetween = Duration.between(date1, date2).toDays();
		System.out.println ("Days: " + daysBetween);

	}
}