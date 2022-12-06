package chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

    public static void main(String[] args) {

        System.out.println("FileCopyTest.main");
        long millisecond = 0;
        try(
            FileInputStream fis = new FileInputStream("data.txt");
            FileOutputStream fos = new FileOutputStream("copydata.txt");
            ) {
            millisecond = System.currentTimeMillis();

            int i;
            while ( (i = fis.read()) != -1) {
                System.out.println("fis.read()  === " +  fis.read());
                fos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;

        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("millisecond = " + millisecond);
    }
}
