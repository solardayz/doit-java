package chapter15.stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
        raf.writeInt(100);
        System.out.println("raf.getFilePointer() = " + raf.getFilePointer());
        raf.writeDouble(3.14);
        System.out.println("raf.getFilePointer() = " + raf.getFilePointer());
        raf.writeUTF("Hello");
        System.out.println("raf.getFilePointer() = " + raf.getFilePointer());
        raf.seek(0);
        System.out.println("raf.getFilePointer() = " + raf.getFilePointer());

        int i = raf.readInt();
        double v = raf.readDouble();
        String s = raf.readUTF();
        System.out.println("raf.getFilePointer() = " + raf.getFilePointer());
        System.out.println("i = " + i);
        System.out.println("v = " + v);
        System.out.println("s = " + s);
    }
}
