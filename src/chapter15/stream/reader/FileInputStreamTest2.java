package chapter15.stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("reader.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.println("(char)i = " + (char) i);
        }
        fis.close();
    }

}
