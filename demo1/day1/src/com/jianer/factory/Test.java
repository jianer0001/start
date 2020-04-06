package com.jianer.factory;

import javax.lang.model.element.VariableElement;

/*
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class Test {
    public static void main(String[] args) {
        A a = Factory.getA("c");
        a.getName();
    }

}
