package com.one.leetcode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Solution {

    public String dayOfTheWeek(int day, int month, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month-1);
        c.set(Calendar.DATE,day);

        SimpleDateFormat sdf = new SimpleDateFormat(" EEEE",Locale.ENGLISH);
        String format = sdf.format(c.getTime());
        return format;
    }
}
