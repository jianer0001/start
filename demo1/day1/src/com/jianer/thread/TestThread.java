package com.jianer.thread;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class TestThread {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread ticket2 = new Thread(ticket, "窗口2");
        Thread ticket1 = new Thread(ticket, "窗口1");
        Thread ticket3 = new Thread(ticket, "窗口3");
        ticket2.start();
        ticket1.start();
        ticket3.start();
        for (int i = 0; i < 9999; i++) {
            System.out.println("我是main线程" + i);
        }
    }
}
