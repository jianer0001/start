package com.jianer.scanner;

import java.util.Scanner;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyScanner {
    public static void main(String[] args) {
//        test1();
        max();
    }

    public static void test1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = scanner.nextInt();
        System.out.println("请输入一个整数");
        int j = scanner.nextInt();
        System.out.println("结果为: " + (i + j) );
    }

    public static void max() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = sc.nextInt();
        System.out.println("请输入一个整数");
        int j = sc.nextInt();
        System.out.println("请输入一个整数");
        int k = sc.nextInt();
        int max = i > j ? i : j;
        max = max > k ? max : k;
        System.out.println("最大值为：" + max);
    }
}
