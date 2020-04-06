package com.jianer.string;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;
import com.sun.deploy.util.UpdateCheck;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyString {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
        test8();
    }

    public static void test1() {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "abcd";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }

    public static void test2() {
        String str = "jianer";
        System.out.println(str.length());
        System.out.println("-------------");
        System.out.println(str.concat("0001"));
        System.out.println(str);
        System.out.println("---------------");
        System.out.println(str.charAt(0));
        System.out.println("---------------");
        System.out.println(str.indexOf("an"));
        System.out.println("----------------");
        System.out.println(str.substring(2));
    }

    public static void test3() {
        String str = "jianer";
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void test4() {
        String str = "jianer";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }

    public static void test5() {
        String str = "jianer";
        String replace = str.replace("er", "er0001");
        System.out.println(replace);
    }

    public static void test6() {
        String str = "yang,xing,jian";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }

    public static void test7() {
        String[] strings = {"a","b","c","d","e"};
        String str = "[";
        for (int i = 0; i < strings.length; i++) {
            str = str.concat(strings[i]);
            if(i < strings.length -1) {
                str = str.concat("#");
            }else {
                str = str.concat("]");
            }
        }
        System.out.println(str);
    }

    public static void test8() {
        String str = "jiasdfjkjppo4544654sd65fsadfjho";
        int big = 0;
        int mouse = 0;
        int number = 0;
        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            if(aByte >= 'a' && aByte <= 'z') {
                mouse += 1;
            }
            if(aByte >= 'A' && aByte <= 'Z') {
                big += 1;
            }
            if(aByte >= '0' && aByte <= '9') {
                number += 1;
            }
        }
        System.out.println("小写字母：" + mouse);
        System.out.println("大写字母：" + big);
        System.out.println("数字：" + number);
    }
}
