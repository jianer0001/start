package com.jianer.arrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyArrayList {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int j = random.nextInt(33) + 1;
            list.add(j);

        }
        System.out.println(list);
    }
}
