package com.jianer.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyProperies {
    public static void main(String[] args) throws IOException {
//        test1();
        test2();
    }

    public static void test2() throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("aaa/ee.txt");
        properties.load(fis);
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));
        fis.close();properties.clone();
    }
    public static void test1() {
        Properties p = new Properties();
        p.setProperty("name","杨兴健");
        p.setProperty("age","29");
        p.setProperty("address","广东湛江");
        System.out.println(p);
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("age"));
        System.out.println(p.getProperty("address"));
        Set<String> names = p.stringPropertyNames();
        for (String name : names) {
            System.out.println(name + "--->" +p.getProperty(name));
        }
    }
}
