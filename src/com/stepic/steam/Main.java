package com.stepic.steam;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
       byte[] data = {1,1,13,10};
       InputStream inputStream = new ByteArrayInputStream(data);
       System.setIn(inputStream);
        int next;
        int previos=System.in.read();

            while (previos >= 0) {
                next = System.in.read();
                if ((previos != 13 ) || (next != 10)) {
                    System.out.write(previos);
                    System.out.println(previos);
                }
                previos = next;
            }
        System.out.flush();
    }
}