package com.jianer.factory;

/*
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class Factory {

    public static A getA(String str) {
        if(str == null) {
            return null;
        }
        if("B".equalsIgnoreCase(str)) {
            return new B();
        }
        if("C".equalsIgnoreCase(str)) {
            return new C();
        }
        if("D".equalsIgnoreCase(str)) {
            return new D();
        }
        return null;
    }
}
