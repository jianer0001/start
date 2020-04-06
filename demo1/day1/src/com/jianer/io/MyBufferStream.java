package com.jianer.io;

import java.io.*;

/**
 * @author —Ó–ÀΩ°
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyBufferStream {
    public static void main(String[] args) throws IOException {
//        test1();

//        test2();
        test3();
    }
    public static void test3() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("aaa/ee.txt"));
        String len;

        while ((len = br.readLine()) != null) {
            System.out.println(len);
        }
        br.close();
    }
    public static void test2() {
        try (FileInputStream fis = new FileInputStream("e:/MarkdownPad+2.rar");
             final FileOutputStream fos = new FileOutputStream("aaa/copy.rar")){
            final long millis = System.currentTimeMillis();
            int len;
            byte[] b = new byte[1024*8];
            while ((len = fis.read(b)) != -1) {
                fos.write(b,0,len);
            }
            System.out.println(System.currentTimeMillis() - millis);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test1() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:/MarkdownPad+2.rar"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aaa/copy.rar"));){
            long time = System.currentTimeMillis();
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            System.out.println(System.currentTimeMillis()-time);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
