package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

    public static String formatDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }
}
