package com.tms.hm13.task0;
/**
 * выводит порядковый номер дня недели
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeek {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2021, 05, 05);
        Integer dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);

    }
}
