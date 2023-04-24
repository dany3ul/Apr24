import java.time.*;
import static java.time.DayOfWeek.*;
import java.time.format.*; // for TextStyle class
import java.time.temporal.ChronoUnit;
import java.util.*; // for Locale class
import static java.time.Month.*;

public class stringTest1 {
    static String stringX() {
        return new String ("Test");
    }

    static String stringY() {
        return "Test";
    }

    public static void main(String[]args){
//        Month day = Month.MARCH;
//        Locale locale = Locale.GERMAN;
//        System.out.println(day.getDisplayName(TextStyle.FULL, locale));
//        System.out.println(day.getDisplayName(TextStyle.NARROW, locale));
//        System.out.println(day.getDisplayName(TextStyle.SHORT, locale));
//
//        System.out.println(FEBRUARY.plus(2));
//        System.out.println(FEBRUARY.minus(3));
//        System.out.println(FEBRUARY.length(true));

//        LocalDate today = LocalDate.now();
//        System.out.println(today);

//        LocalDate date = LocalDate.of(2015, JANUARY, 2);
//        System.out.println(date);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("MM/dd/yy");
//        String myScan = scan.nextLine();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
//        LocalDate date = LocalDate.parse(myScan, formatter);
//        System.out.println(date);

//        LocalDate date = LocalDate.of(2015, DECEMBER, 2);
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        System.out.println(dayOfWeek);
//        Month month = date.getMonth();
//        System.out.println(month);
//        System.out.println(date.getYear()); // int
//        System.out.println(date.getDayOfMonth()); // int
//        System.out.println(date.getDayOfYear()); // int

//        System.out.println("change the year");
//        Scanner scan = new Scanner(System.in);
//        String myScan = scan.nextLine();
//
//        LocalDate date = LocalDate.of(2015, DECEMBER, 2);
////        System.out.println(date.with(JULY)); // 2015-07-02
////        System.out.println(date.with(SUNDAY)); // Sunday after date 2015-12-06
////        System.out.println(date.withDayOfMonth(5)); // 2015-12-05
////        System.out.println(date.withMonth(5)); // 2015-05-02
//        System.out.println(date.withYear(Integer.parseInt(myScan))); // 1995-12-02
////        System.out.println(date.withDayOfYear(5)); // 2015-01-05

//        LocalDate now = LocalDate.now();
//        LocalDate date = LocalDate.of(2015, DECEMBER, 2);
//        System.out.println(now.isBefore(date));
//        System.out.println(now.isAfter(date));
//        System.out.println(now.equals(date));

//        LocalDate date = LocalDate.of(2015, DECEMBER, 2);
//        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM/dd/yy");
//        System.out.println(date.format(f1));
//        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
//        System.out.println(date.format(f2));
//        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("eee MMM dd yyyy");
//        System.out.println(date.format(f3));

//        YearMonth ymNow = YearMonth.now();
//        System.out.println(ymNow);
//        YearMonth jul05 = YearMonth.of(2005, JULY);
//        System.out.println(jul05);
//        System.out.println(jul05.isBefore(ymNow));
//        System.out.println(jul05.isAfter(ymNow));
//        System.out.println(jul05.plusMonths(3));
//        System.out.println(jul05.minusMonths(3));
//        System.out.println(jul05.plusYears(3));
//        System.out.println(jul05.minusYears(3));
//        System.out.println(jul05.with(MARCH));
//        System.out.println(jul05.withYear(1995));
//        System.out.println(jul05.isBefore(ymNow));
//        System.out.println(jul05.isAfter(ymNow));
//        System.out.println(jul05.equals(ymNow));

//        Year thisYear = Year.now();
//        System.out.println(thisYear);
//        System.out.println(thisYear.isLeap());
//        LocalDate date100 = thisYear.atDay(100);
//        System.out.println(date100);
//        YearMonth novThisYear = thisYear.atMonth(NOVEMBER);
//        System.out.println(novThisYear);
//        Year y2k = Year.of(2000);
//        System.out.println(y2k);

//        System.out.println(LocalTime.now());
//        System.out.println(LocalTime.MIDNIGHT);
//        System.out.println(LocalTime.NOON);
//        System.out.println(LocalTime.MIN);
//        System.out.println(LocalTime.MAX);
//        LocalTime breakfast = LocalTime.of(6, 15); // overloaded, see Javadoc
//        System.out.println(breakfast);
//        System.out.println(breakfast.getHour());
//        System.out.println(breakfast.getMinute());
//        System.out.println(breakfast.getSecond());
//        System.out.println(breakfast.getNano());

//        System.out.println(LocalDateTime.now());
//        LocalDateTime birthMinute = LocalDateTime.of(1995, JULY, 10, 9, 45);
//        System.out.println(birthMinute);
//        LocalDate birthday = LocalDate.of(1995, JULY, 10);
//        LocalTime birthTime = LocalTime.of(9, 45);
//        LocalDateTime birthMinuteV2 = LocalDateTime.of(birthday, birthTime);
//        System.out.println(birthMinuteV2);
//        System.out.println(birthMinuteV2.getYear());
//        System.out.println(birthMinuteV2.getMonth());
//        System.out.println(birthMinuteV2.getSecond());
//        System.out.println(birthMinuteV2.getNano());

//        ZoneId chicagoZone = ZoneId.of("America/Chicago");
//        LocalDateTime chicagoLDT = LocalDateTime.of(2015, JUNE, 15, 9, 30);
//        ZonedDateTime chicagoZDT = ZonedDateTime.of(chicagoLDT, chicagoZone);
//        System.out.println(chicagoZDT);
//        ZoneId here = ZoneId.systemDefault();
//        System.out.println(here);
//        ZonedDateTime hereZDT = chicagoZDT.withZoneSameInstant(here);
//        System.out.println(hereZDT);

//        Instant now = Instant.now();
//        System.out.println(now);
//
//        ZonedDateTime nowZDT = ZonedDateTime.now();
//        System.out.println(nowZDT);

//        Instant now = Instant.now();
//        System.out.println(now);
//        ZonedDateTime hereNow = now.atZone(ZoneId.systemDefault());
//        System.out.println(hereNow);
//        LocalDateTime localNow = hereNow.toLocalDateTime();
//        System.out.println(localNow);
//        LocalTime localTime = hereNow.toLocalTime();
//        System.out.println(localTime);
//        LocalDate localDate = localNow.toLocalDate();
//        System.out.println(localDate);
//        ZonedDateTime nowTokyo = ZonedDateTime.ofInstant(now, ZoneId.of("Asia/Tokyo"));
//        System.out.println(nowTokyo);

//        Instant now = Instant.now();
//        Instant then = now.minus(10000, ChronoUnit.SECONDS); // 10k seconds before
//        Duration duration = Duration.between(then, now);
//        System.out.println(duration.getSeconds());
//        System.out.println(duration.toMinutes());
//        System.out.println(duration.toHours());
//        System.out.println(duration.toDays());

//        Instant now = Instant.now();
//        System.out.println(now);
//        Duration tenMinutes = Duration.ofMinutes(10);
//        Instant tenFromNow = now.plus(tenMinutes);
//        System.out.println(tenFromNow);

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        Period oneMonth = Period.ofMonths(1);
//        LocalDateTime oneMonthAgo = now.minus(oneMonth);
//        System.out.println(oneMonthAgo);

        Calendar cal = Calendar.getInstance();
        cal.set(2015, Calendar.MAY, 3); // MAY is an int constant, not an Enum
        Date date = cal.getTime();
        System.out.println(date);
    }
}
