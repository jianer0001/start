package com.jianer.system;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MySystem {
    public static void main(String[] args) {
        /*long timeMillis = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis() - timeMillis);*/

        int[] arr1 = {1,2,3,4},arr2 = {5,6,7,8,9};
        System.arraycopy(arr1,0,arr2,0,3);
        for (int i : arr2) {
            System.out.println(i);
        }

    }
}
