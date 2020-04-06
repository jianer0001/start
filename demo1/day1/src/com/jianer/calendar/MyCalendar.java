package com.jianer.calendar;

import com.sun.xml.internal.fastinfoset.util.ValueArray;

import javax.xml.crypto.Data;
import java.net.SocketTimeoutException;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyCalendar {
    public static void main(String[] args) {
       /* Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int day = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + (month+1) + "月" + day + "日");

        System.out.println("==============================");

        instance.set(1970,2,15);
        year = instance.get(Calendar.YEAR);
        month = instance.get(Calendar.MONTH);
        day = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + (month+1) + "月" + day + "日");*/

        Calendar instance = Calendar.getInstance();
       /* instance.add(Calendar.YEAR,-1);
        System.out.println(instance.get(Calendar.YEAR) + "年" + instance.get(Calendar.MONTH) + "月" + instance.get(Calendar.DAY_OF_MONTH) + "日");*/
        Date date = instance.getTime();
        System.out.println(date);


    }
}
