package com.one.calendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class main {

    public static void main(String[] args) {


        Calendar curDate = Calendar.getInstance();

        Calendar calendar = (Calendar)curDate.clone();

        List<Date> cells = new ArrayList<>();
        calendar.set(Calendar.DAY_OF_MONTH,1);
        int prevDays = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("prevDays : " + prevDays);

        // 将日程的天数移动到需要绘制的第一天
        calendar.add(Calendar.DAY_OF_MONTH,-prevDays);

    }
}
