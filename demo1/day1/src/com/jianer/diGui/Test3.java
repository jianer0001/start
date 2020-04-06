package com.jianer.diGui;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class Test3 {
    public static void main(String[] args) {
        File file = new File("aaa");
//        test1(file);
//        System.out.println("------------------");
//        test2(file);
//        System.out.println("-------------");
//        test3(file);
        test4(file);
    }
    public static void test1(File file) {
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                test1(file1);
            }
        }
    }

    public static void test2(File file) {
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                test2(f);
            }
        }
        if(file.getName().endsWith(".txt")) {
            System.out.println(file.getAbsolutePath());
        }

    }
    public static void test3(File file) {

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory() || pathname.getName().endsWith(".java")) {
                    return true;
                }
                return false;
            }
        });

        for (File f : files) {
            if(f.isDirectory()) {
                test3(f);
            }else {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
    public static void test4(File file) {

        File[] files = file.listFiles(f -> {
            return f.isDirectory() || f.getName().endsWith(".java");
        });

        for (File f : files) {
            if(f.isDirectory()) {
                test3(f);
            }else {
                System.out.println(f.getAbsolutePath());
            }
        }
    }

}
