package com.jianer.io;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyFileOutputStream {
    public static void main(String[] args) throws IOException {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }
    public static void test5() throws IOException {
        FileOutputStream fos = new FileOutputStream("aaa/fos.txt");
        byte[] bytes = "fksjdkfjl".getBytes();
        for (byte b : bytes) {
            fos.write(b);
            byte[] bytes1 = "\r\n".getBytes();
            fos.write(bytes1);
        }
        fos.close();
    }
    public static void test4() throws IOException {
        FileOutputStream fos = new FileOutputStream("aaa/ccc.txt",true);
        byte[] bytes = "dfsf".getBytes();
        fos.write(bytes);
        fos.close();
    }
    public static void test3() throws IOException {
        FileOutputStream fos = new FileOutputStream("aaa/ccc.txt");
        byte[] bytes = "abcde".getBytes();
        fos.write(bytes,2,2);
        fos.close();
    }
    public static void test2() throws IOException {
        FileOutputStream fos = new FileOutputStream("aaa/ccc.txt");
        byte[] bytes = "1我是杨兴健,who are you".getBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }
        fos.write(bytes);
        fos.close();
    }
    public static void test1() throws IOException {
        FileOutputStream fos = new FileOutputStream("aaa/ccc.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }

}
