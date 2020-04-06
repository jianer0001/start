package com.jianer.arrays;

import com.sun.deploy.util.UpdateCheck;

import java.util.Arrays;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyArrays {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    public static void test1() {
        char[] chars = {'a','b','e','f'};
        String s = Arrays.toString(chars);
        System.out.println(s);
    }

    public static void test2() {
        int[] arr = {1,45,62,85,3,55,26,8,9,41};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void test3() {
        String str = "djkfjaodifiwoejfowejifjaio";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
