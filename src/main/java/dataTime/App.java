package dataTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM,
            new Locale("uk", "UA"));
        String dateStr = dateFormat.format(new Date());
        System.out.println(dateStr);

        Date date = null;
        try {
            date = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

}
