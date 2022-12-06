package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest6 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("source.txt");
            FileInputStream fis = new FileInputStream("source.txt");
        ) {
            fos.write(60);
            fos.write(90);
            fos.write(40);

            System.out.println("fis.read() = " + (char)fis.read());
            System.out.println("fis.read() = " + fis.read());
            System.out.println("fis.read() = " + fis.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
