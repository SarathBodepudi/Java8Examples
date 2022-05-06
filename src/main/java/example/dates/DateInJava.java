package example.dates;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateInJava {

	public static void main(String[] args) {
		String docCheckedOutDate = "2021-12-22T14:56:57Z";
		ZoneId defaultZoneId = ZoneId.systemDefault();
		
		Instant instant = Instant.parse(docCheckedOutDate);
		LocalDateTime checkedOutDateTime = instant.atZone(defaultZoneId).toLocalDateTime();
		System.out.println("checkedOutDateTime :" + checkedOutDateTime);
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime1 :" + localDateTime);
		
		localDateTime = localDateTime.truncatedTo(ChronoUnit.SECONDS);
		System.out.println("localDateTime2 :" + localDateTime);
		
		System.out.println("Days Difference :" + Duration.between(checkedOutDateTime, localDateTime).toDays());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault());
	    System.out.println("Date Now1 :" + sdf.format(new Date()));
	    
	    
	    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault());
	    sdf2.format(new Date());
	    System.out.println("Date Now2 :" + sdf2.format(new Date()));
	    
		System.out.println(LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS).toString());
		
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'",              Locale.US);
		isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = new Date();
		String dateToday = isoFormat.format(date);
		System.out.println("dateToday :" + dateToday);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
		LocalDateTime localDateTime2 = LocalDateTime.now();
		//String dateToday2 = isoFormat.format(localDateTime2);
		System.out.println("dateToday2 :" + localDateTime2.format(formatter));
		
		LocalDateTime date22 = LocalDateTime.now(Clock.systemUTC()).minusDays(10).plusHours(9);
		System.out.println("date22 :" + date22.format(formatter));
		
		
		//DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/uuuu'T'HH:mm:ss:SSSXXXXX");
		DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss");
		//Date string with offset information
		String dateString = "03/08/2019T16:20:17:717+05:30";
		dateString = "2021-12-27T14:42:22.212533800";
		
		/*
		 * //Instance with given offset OffsetDateTime odtInstanceAtOffset =
		 * OffsetDateTime.parse(localDateTime.toString(), DATE_TIME_FORMATTER);
		 * 
		 * //Instance in UTC OffsetDateTime odtInstanceAtUTC =
		 * odtInstanceAtOffset.withOffsetSameInstant(ZoneOffset.UTC);
		 * 
		 * //Formatting to string String dateStringInUTC =
		 * odtInstanceAtUTC.format(DATE_TIME_FORMATTER);
		 * 
		 * System.out.println(odtInstanceAtOffset);
		 * System.out.println(odtInstanceAtUTC); System.out.println(dateStringInUTC);
		 * 
		 * //Convert OffsetDateTime to instant which is in UTC
		 * System.out.println(odtInstanceAtOffset.toInstant());
		 */
		
		
		LocalDate aDate = LocalDate.of(2020, 9, 11);
	    LocalDate sixtyDaysBehind = aDate.minusDays(60);
	    Period period = Period.between(aDate, sixtyDaysBehind);
	    int years = Math.abs(period.getYears());
	    int months = Math.abs(period.getMonths());
	    int days = Math.abs(period.getDays());
	    
	    System.out.println("years :" + years + "months :" + months + "days :" + days );
	    
	    
	    LocalDate dateBefore = LocalDate.of(2017, Month.MAY, 24);
        //29-July-2017, change this to your desired End Date
		LocalDate dateAfter = LocalDate.of(2017, Month.JULY, 29);
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		System.out.println(noOfDaysBetween);
		
		
		LocalDate dateToday1 = LocalDate.now();
        //29-July-2017, change this to your desired End Date
		LocalDate dateAfter1 = LocalDate.now().minusDays(90);
		long noOfDaysBetween1 = ChronoUnit.DAYS.between(dateToday1, dateAfter1);
		System.out.println(noOfDaysBetween1);
	}

}
