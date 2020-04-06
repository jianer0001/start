package com.jianer.io;

import com.sun.deploy.util.UpdateCheck;

import java.io.*;

/**
 * @author —Ó–ÀΩ°
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyIuputStreamReader {
    public static void main(String[] args) throws IOException {
//        test1();
        test2();
    }
    public static void test1() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("aaa/ff.txt"),"gbk");
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("aaa/ff.txt"),"utf-8");

        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char)len);
        }
        isr.close();

        while ((len = isr2.read()) != -1) {
            System.out.print((char)len);
        }
        isr2.close();

    }

    public static void test2() throws IOException {
        final InputStreamReader isr = new InputStreamReader(new FileInputStream("aaa/ff.txt"), "gbk");
        final OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("aaa/copy_ff.txt"), "utf-8");

        int len;
        char[] b = new char[1024];

        while ((len = isr.read(b)) != -1) {
            osw.write(b,0,len);
        }

        isr.close();
        osw.close();
    }
}
