package com.jianer.thread;

import javax.lang.model.element.VariableElement;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {

           lock.lock();

            try {
                if (ticket > 0) {

                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + "售卖第" + ticket-- + "张票");

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }


    }

}
