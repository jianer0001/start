package com.jianer.stringBuild;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyStringBuild {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();

    }

    public static void test3() {
        String s = "hello";
        s = s.toUpperCase();
        System.out.println(s);
    }
    public static void test1() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("我").append("是").append("杨").append("兴").append("健").append(true).append(123);
        System.out.println(stringBuilder);
    }

    public static void test2() {
        int i = Integer.parseInt("200");
        System.out.println(i+200);
        System.out.println("----------------");

        float v = Float.parseFloat("21.21");
        System.out.println(v + 12);
        System.out.println("-----------------");

        boolean aTrue = Boolean.parseBoolean("true");
        if(aTrue) {
            System.out.println("true");

        }
    }
}
