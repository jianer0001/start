package com.jianer.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyRandom {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.println(random.nextInt(10));
        }
    }

    public static void test2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("请猜一个1~100的整数");
        while(true) {
            int g = scanner.nextInt();
            if(number == g) {
                System.out.println("恭喜你，猜对了");
                return;
            }
            if(number > g) {
                System.out.println("猜小了");
            }

            if(number < g) {
                System.out.println("猜大了");
            }
            System.out.println("请重新猜一个1~100的整数");
        }
    }
}
