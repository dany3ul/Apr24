import java.time.*;
import java.util.*;
import static java.time.Month.*;
import java.time.format.*;


public class localArrival {

    static LocalDateTime arrival(ZonedDateTime departure, Duration flightTime) {
        // add your code here
        ZonedDateTime arrivalThere = departure.plus(flightTime);
        ZonedDateTime arrivalHere = arrivalThere.withZoneSameInstant(ZoneId.systemDefault());
        return arrivalHere.toLocalDateTime();
    }

    public static void main(String[] args) {
        ZonedDateTime harareDeparture = ZonedDateTime.of(
                LocalDateTime.of(2015, DECEMBER, 1, 9, 15),
                ZoneId.of("Africa/Harare"));
        Duration harareFlightTime = Duration.ofHours(20);
        LocalDateTime arrival = arrival(harareDeparture, harareFlightTime);
        System.out.println(arrival); // 2015-12-02T11:15
    }
}
