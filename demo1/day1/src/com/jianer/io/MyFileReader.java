package com.jianer.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author —Ó–ÀΩ°
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyFileReader {
    public static void main(String[] args) throws IOException {
//        test1();
        test2();
    }
    public static void test2() throws IOException {
        FileReader fr = new FileReader("aaa/ccc.txt");
        int len;
        char[] b = new char[2];
        while ((len = fr.read(b)) != -1) {
            System.out.println(new String(b,0,len));
        }

        fr.close();
    }
    public static void test1() throws IOException {
        FileReader fr = new FileReader("aaa/ccc.txt");
        int len;
        while ((len = fr.read()) != -1) {
            System.out.println((char) len);
        }
        fr.close();
    }
}
