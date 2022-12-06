package chapter15.stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args) {
        int i;
        try {
            i = System.in.read();
            System.out.println("i = " + i);
            System.out.println("(char)i = " + (char)i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
