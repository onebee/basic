package com.one.generic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test {


    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sdfDayChinese = new SimpleDateFormat("dd 日", Locale.CHINESE);
    private static SimpleDateFormat sdfDayEnglish = new SimpleDateFormat("dd", Locale.ENGLISH);

    static String date = "2020-08-05";

    private static SimpleDateFormat sdfWeekChinese = new SimpleDateFormat("E", Locale.CHINESE);
    private static SimpleDateFormat sdfWeekEnglish = new SimpleDateFormat("EEE", Locale.ENGLISH);


    public static void main(String[] args) {

        try {
            Date date1 = sdf.parse(date);

            String dayChinese = sdfDayChinese.format(date1);
            System.out.println(dayChinese);

            String dayEnglish = sdfDayEnglish.format(date1);
            System.out.println(dayEnglish);

            String weekChinese = sdfWeekChinese.format(date1);
            String weekEnglish = sdfWeekEnglish.format(date1);

            System.out.println(weekChinese.replaceAll("星期","周"));
            System.out.println(weekEnglish);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
