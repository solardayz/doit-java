package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("reader.txt")){
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println("i = " + (char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
