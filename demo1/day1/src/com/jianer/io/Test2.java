package com.jianer.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author —Ó–ÀΩ°
 * @site blog.jianer.com
 * @description Javaer
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("aaa/yyy.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("aaa/copy_yyy.txt"));

       String len;
        Map<String,String> map = new HashMap<String,String>();
        while ((len = br.readLine()) != null) {
           String[] split = len.split("\\.");
           map.put(split[0],split[1]);
       }
        br.close();

        Set<String> keySet = map.keySet();
        for (int i = 0; i < keySet.size(); i++) {
            String key = String.valueOf(i+1);
            String value = map.get(key);
            bw.write(key + "." +value);
            bw.newLine();
        }
        bw.close();
    }
}
