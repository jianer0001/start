package com.jianer.io;



import java.io.FileInputStream;

import java.io.IOException;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyFileInpustream {
    public static void main(String[] args) throws IOException {
//        test1();
//        test2();
        test3();
    }
    public static void test3() throws IOException {
        FileInputStream fis = new FileInputStream("aaa/ccc.txt");
        int len;
        byte[] b = new byte[2];
        while ((len = fis.read(b)) != -1) {
            String s = new String(b,0,len);
            System.out.println(s);
        }

    }
    public static void test2() throws IOException {
        FileInputStream fis = new FileInputStream("aaa/ccc.txt");
        int len;
        while ((len = fis.read()) != -1) {
            System.out.println((char)len);
        }
        fis.close();
    }
    public static void test1() throws IOException {
        FileInputStream fio = new FileInputStream("aaa/ccc.txt");
        System.out.println((char) fio.read());
        System.out.println((char) fio.read());
        System.out.println((char) fio.read());
        System.out.println((char) fio.read());
        System.out.println((char) fio.read());
        System.out.println((char) fio.read());
        System.out.println(fio.read());
        System.out.println(fio.read());

        fio.close();
    }


}
