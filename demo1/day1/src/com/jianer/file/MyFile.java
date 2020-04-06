package com.jianer.file;

import sun.nio.cs.SingleByte;

import javax.xml.bind.SchemaOutputResolver;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyFile {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//        test8();
        test9();
    }

    public static void test9() {
        File file = new File("aaa");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
        System.out.println("--------------");

        String[] list1 = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });
        for (String s : list1) {
            System.out.println(s);
        }
    }
    public static void test8() {
        File file = new File("aaa/bbb");
        System.out.println(file.mkdir());
        File file1 = new File("aaa/cce");
        System.out.println(file1.mkdir());
    }

    public static void test1() {
        String parent = "e:/MarkdownPad+2.rar";
        File file = new File(parent);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println("-------------");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }

    public static void test2() {
        String parent = "e:/aaa.txt";
        File file = new File(parent);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
    }

    public static void test3() {
        String parent = "aaa.txt";
        File file = new File(parent);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
    }

    public static void test4() {
        File file1 = new File("/aaa/.txt");
        File file2 = new File("/aaa/bbb");
        System.out.println(file1.exists());
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file1.exists());
        System.out.println("---------------------");
        System.out.println(file2.exists());
        System.out.println(file2.mkdir());
        System.out.println(file2.mkdirs());
        System.out.println(file2.exists());
    }

    public static void test5() {
        File file1 = new File("aaa/.txt");
        File file2 = new File("aaa/bbb");
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file2.mkdirs());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
    }

    public static void test6() {
        File file = new File("aaa");
        File file1 = new File("aaa/bbb");
        System.out.println(file.delete());
        System.out.println(file1.delete());
    }

    public static void test7() {
        File file = new File("aaa/yyy.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file1 = new File("aaa/bbbb.txt");
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
