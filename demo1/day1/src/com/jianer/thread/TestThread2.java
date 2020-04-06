package com.jianer.thread;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class TestThread2 {
    public static void main(String[] args) {
//        test1();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(i % 10 == 0 && i != 0) {
                        System.out.println("==================");
                    }
                }
            }
        }).start();
    }

    public static void test1() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%10 == 0 && i != 0) {
                System.out.println("=================");
            }
        }
    }
}
