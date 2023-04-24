import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import static java.time.Month.*;

public class test {
    public static void main(String[] args) {
        ZoneId chicagoZone = ZoneId.of("America/Chicago");
        LocalDateTime chicagoLDT = LocalDateTime.of(2015, JUNE, 15, 9, 30);
        ZonedDateTime chicagoZDT = ZonedDateTime.of(chicagoLDT, chicagoZone);
        System.out.println(chicagoZDT);
        ZoneId here = ZoneId.systemDefault();
        System.out.println(here);
        ZonedDateTime hereZDT = chicagoZDT.withZoneSameInstant(here);
        System.out.println(hereZDT);
    }
}
