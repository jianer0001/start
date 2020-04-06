package com.jianer.excepiton;

/**
 * @author 杨兴健
 * @site blog.jianer.com
 * @description Javaer
 */
public class RegisterException extends RuntimeException {
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
