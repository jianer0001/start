package com.jianer.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author —Ó–ÀΩ°
 * @site blog.jianer.com
 * @description Javaer
 */
public class MySocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);
        InputStream is = socket.getInputStream();
        int len;
        byte[] b = new byte[1024];

        while((len = is.read(b)) != -1) {
            System.out.println(new String(b,0,len));
        }
        is.close();
        socket.close();
    }
}
