package com.one.day27;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tesss {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : hh-mm-ss");
        Calendar calendar = Calendar.getInstance();
        String format = sdf.format(new Date(calendar.getTimeInMillis()));

        int actualMaximum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(format + "----" + actualMaximum);


        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(" day : " + day);


        calendar.set(Calendar.MONTH, 1);

        int actualMaximum1 = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        String format1 = sdf.format(new Date(calendar.getTimeInMillis()));
        System.out.println(format1 + "-----" + actualMaximum1);


        int i = calendar.get(Calendar.HOUR);
        System.out.println("小时 : " + i);

        int minute = calendar.get(Calendar.MINUTE);
        System.out.println(" 分钟 : " + minute);

        calendar.set(Calendar.DAY_OF_MONTH,0);
        String format2 = sdf.format(new Date(calendar.getTimeInMillis()));
        System.out.println("  xxxx : " + format2);
        int i1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("  day -- " + i1);


    }
}
