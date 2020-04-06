package com.jianer.diGui;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class DiGui {

    public static void main(String[] args) {
        test1(1);
    }
    public static void test1(int i) {
        if(i < 10000) {
            System.out.println(i);
            test1(++i);

        }
    }
}
