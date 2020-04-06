package com.jianer.thread.threadPool;


import javax.lang.model.element.VariableElement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyPool {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("我需要一个游泳教练");
                System.out.println(Thread.currentThread().getName() + "游泳教练来了");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("教完游泳，教练走了");
            }
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.submit(r);
    }
}
