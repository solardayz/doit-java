package chapter15.stream.decorator;

import java.io.*;

public class DataStreamTest {

    public static void main(String[] args) {
        try(
        FileOutputStream fos = new FileOutputStream("data.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        ) {
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        }catch (IOException e) {
            e.printStackTrace();
        }

        try(
                FileInputStream fis = new FileInputStream("data.txt");
                DataInputStream dis = new DataInputStream(fis);
        ) {
            System.out.println("dis.readByte() = " + dis.readByte());
            System.out.println("dis.readChar() = " + dis.readChar());
            System.out.println("dis.readInt() = " + dis.readInt());
            System.out.println("dis.readFloat() = " + dis.readFloat());
            System.out.println("dis.readUTF() = " + dis.readUTF());
        }catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
