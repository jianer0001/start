package com.jianer.math;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyMath {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        int i = Math.abs(-45);
        System.out.println(i);
        double ceil = Math.ceil(56.23);
        System.out.println(ceil);
        long round = Math.round(5.4545);
        System.out.println(round);
    }

    public static void test2() {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (int i = (int)Math.ceil(min); i < (int)Math.floor(max); i++) {
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println(count);
    }
}
