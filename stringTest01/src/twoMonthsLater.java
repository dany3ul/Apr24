import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class twoMonthsLater {

    static Date twoMonthsLater(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 2);
        return cal.getTime();
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2014, Calendar.DECEMBER, 31); // Wed Dec 31 XX:XX:XX PHT 2014
        twoMonthsLater(cal.getTime());
        System.out.println(twoMonthsLater(cal.getTime())); // Sat Feb 28 XX:XX:XX PHT 2015
    }
}
