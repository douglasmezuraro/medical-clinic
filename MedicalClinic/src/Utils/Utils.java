package Utils;

import java.util.Calendar;
import java.util.Date;

public final class Utils {
    
    public static Date incDay(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }
    
    public static Date tomorrow() {
        return incDay(new Date(), 1);
    }
    
    public static boolean isNullOrEmpty(String value) {
        return (value == null) || value.isEmpty();
    }
    
}
