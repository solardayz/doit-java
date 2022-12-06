package chapter15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output3.txt")) {
            byte[] bytes = new byte[26];
            byte data = 65;
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = data;
                data++;
            }

            fos.write(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
