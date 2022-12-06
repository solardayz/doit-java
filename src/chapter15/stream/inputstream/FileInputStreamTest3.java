package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("reader.txt")){
            byte[] bytes = new byte[10];
            int i;
            while ( (i = fis.read(bytes)) != -1) {
                for (byte b : bytes) {
                    System.out.println(i + " : " +(char) b);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
