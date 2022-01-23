package com.stepic.Reader;
import java.nio.charset.Charset;
import java.io.*;

public class TrainingReader {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        int i;
        StringBuilder strBuil = new StringBuilder();
        while((i = reader.read()) != -1){
            char ch = (char)i;
            strBuil.append(ch);

        }
    return strBuil.toString();
    }
    public static void main(String[] args) throws IOException {
        byte[] buf = {48, 49, 50, 51};
        ByteArrayInputStream arr = new ByteArrayInputStream(buf);
        System.out.println(readAsString(arr, Charset.forName("US-ASCII")));
    }
}
