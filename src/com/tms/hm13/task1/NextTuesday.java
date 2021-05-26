package com.tms.hm13.task1;
/**
 * Ищет дату следующего вторника
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NextTuesday {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar = new GregorianCalendar(2021, 03, 1);
        Integer dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        int dop;
        if (dayOfWeek == 1){
            dop = 2;
        }else{
            dop = 7 - (dayOfWeek - 3);
        }

        Calendar nextTuesday = new GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)+dop);
        System.out.println("Исходня дата " + dateFormat.format(calendar.getTime()));
        System.out.println("Следующий вторник " + dateFormat.format(nextTuesday.getTime()));
    }
}
