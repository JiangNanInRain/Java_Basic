package Chapter11;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo3 {
    public static void main(String[] args) {
        DateFormat f1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN"));
        DateFormat f2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.ERA_FIELD,new Locale("zh","CN"));
        System.out.println(f1.format(new Date()));
        System.out.println(f2.format(new Date()));


    }
}
