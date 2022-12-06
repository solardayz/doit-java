package chapter15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output2.txt");

        try (fos) {
            byte[] bytes = new byte[26];
            byte data = 65;
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = data;
                data++;
            }

            fos.write(bytes);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
