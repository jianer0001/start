package com.jianer.io;

import sun.security.action.PutAllAction;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ���˽�
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
        fw.write("�������˽�");
        fw.write("\r\n");
        fw.write("���ǳ³���");
        fw.close();
    }
    public static void test2() throws IOException{
        FileWriter fw = new FileWriter("aaa/ee.txt");
        char[] chars = "�������˽�".toCharArray();
        fw.write(chars,2,3);
        fw.close();
    }
    public static void test1() throws IOException {
        FileWriter fw = new FileWriter("aaa/fileWriter.txt");
        fw.write(97);
        fw.write("�������˽�");
        fw.write('��');
        fw.close();
    }
}
