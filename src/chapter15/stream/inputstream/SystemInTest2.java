package chapter15.stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {
        int i;
        while (true) {
            try {
                if (((i = System.in.read()) != '\n')) {
                    System.out.print((char)i);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
