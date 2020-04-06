package com.jianer.diGui;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class Test1 {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }

    private static int sum(int i) {
        if(i == 1) {
            return 1;
        }
        return i + sum(--i);
    }
}
