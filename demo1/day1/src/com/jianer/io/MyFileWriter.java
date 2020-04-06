package com.jianer.io;

import sun.security.action.PutAllAction;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyFileWriter {
    public static void main(String[] args) throws IOException {
//        test1();
//        test2();
        test3();
    }
    public static void test3() throws IOException {
        FileWriter fw = new FileWriter("aaa/ff.txt");
        fw.write("我是杨兴健");
        fw.write("\r\n");
        fw.write("我是陈楚茵");
        fw.close();
    }
    public static void test2() throws IOException{
        FileWriter fw = new FileWriter("aaa/ee.txt");
        char[] chars = "我是杨兴健".toCharArray();
        fw.write(chars,2,3);
        fw.close();
    }
    public static void test1() throws IOException {
        FileWriter fw = new FileWriter("aaa/fileWriter.txt");
        fw.write(97);
        fw.write("我是杨兴健");
        fw.write('我');
        fw.close();
    }
}
