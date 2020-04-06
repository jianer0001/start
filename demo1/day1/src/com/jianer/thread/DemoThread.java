package com.jianer.thread;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class DemoThread {
    public static void main(String[] args) {
        new MyThread("我的线程").start();
        for (int i = 0; i < 999; i++) {
            System.out.println("主线程" + i);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 999; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        },"runnable线程").start();
    }
}
