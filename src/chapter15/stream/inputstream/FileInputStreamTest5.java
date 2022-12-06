package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("reader.txt")){
            System.out.println("(char)fis.read() = " + (char)fis.read());
            System.out.println("(char)fis.read() = " + (char)fis.read());
            System.out.println("(char)fis.read() = " + (char)fis.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
