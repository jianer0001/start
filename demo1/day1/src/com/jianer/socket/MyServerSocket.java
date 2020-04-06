package com.jianer.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ÑîÐË½¡
 * @site blog.jianer.com
 * @description Javaer
 */
public class MyServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        while (true) {
            Socket socket = serverSocket.accept();
            OutputStream os = socket.getOutputStream();
            byte[] bytes = "ÄúºÃÑ½".getBytes();
            os.write(bytes);
            os.close();
            socket.close();

        }

    }
}
