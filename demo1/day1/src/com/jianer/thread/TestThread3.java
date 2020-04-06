package com.jianer.thread;

import java.security.Principal;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class TestThread3 {
    private static Object object = new Object();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    for (int i = 0; i < 50; i++) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + i);
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"睡眠线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    for (int i = 0; i < 900; i++) {
                        System.out.println(Thread.currentThread().getName() + "获取到锁" + i);
                        try {
                            object.wait(100);
                            object.notify();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"等待线程").start();
    }
}
