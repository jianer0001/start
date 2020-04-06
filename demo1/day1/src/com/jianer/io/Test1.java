package com.jianer.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream( "aaa/ccc.txt");
        FileOutputStream fos = new FileOutputStream("aaa/copy.txt");

        int len;
        byte[] b = new byte[1024];

        while ((len = fis.read(b)) != -1) {
            fos.write(b,0,len);
        }

        fos.close();
        fis.close();
    }
}
