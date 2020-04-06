package com.jianer.diGui;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class Test2 {
    public static void main(String[] args) {
        int num = 3;
        int value = getValue(num);
        System.out.println(value);
    }

    private static int getValue(int num) {
        if(num <= 0) {
            throw new RuntimeException("不可以输入负数");
        }
        if(num == 1) {
            return 1;
        }

        return num * getValue(num - 1);
    }
}
