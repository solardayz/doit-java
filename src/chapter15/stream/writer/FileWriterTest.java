package chapter15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("writer.txt")) {
            fw.write('A');
            char buf[] = {'B','C','D','E','F','G'};
            fw.write(buf);
            fw.write("Hello");
            fw.write(buf,1,2);
            fw.write("65");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
