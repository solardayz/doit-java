package chapter15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest4 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output4.txt", true)) {
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(68);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
