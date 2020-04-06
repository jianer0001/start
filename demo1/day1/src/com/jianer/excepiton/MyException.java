package com.jianer.excepiton;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyException {
    public static void main(String[] args) {
//        test1();
        test2("li");
    }

    public static void test1() {
        String[] strings = {"djk","jd","e"};
        String s = null;
        try {
            s = getElement(strings, 3);
        } catch (IndexOutOfBoundsException e) {
//            System.out.println("下标越界了");
            System.out.println(e.getMessage());
        }
        System.out.println(s);
    }

    public static <E> E getElement(E[] e,int index) throws IndexOutOfBoundsException{
        if(index < 0 || index > e.length -1) {
            throw new IndexOutOfBoundsException("哥们，下标业界了");
        }
        E e1 = e[index];
        return e1;

    }

    public static void test2(String username) {
        //模拟数据库
        String[] db = {"zhang","li","wang"};
        for (String s : db) {
            if(s.equalsIgnoreCase(username)) {
                throw new RegisterException("用户名:" + username + ",已经存在！");
            }
        }

        System.out.println("注册成功");
    }
}
