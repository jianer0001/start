package com.jianer.io;

import com.sun.corba.se.impl.oa.poa.POAPolicyMediatorImpl_NR_USM;

import java.awt.image.PackedColorModel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class TestIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("aaa/1.jpg");
        FileOutputStream fos = new FileOutputStream("aaa/copy.jpg");
        int len;
        byte[] b = new byte[1024*8];
        while ((len = fis.read(b)) != -1) {
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
