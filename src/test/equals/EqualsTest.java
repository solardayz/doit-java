package test.equals;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class EqualsTest {

    public static void main(String[] args) throws Exception {
        String a = new String("AA");
        String b = a;
        String c = new String("AA");

        //equals 값 비교
        // == 주소값 비교
        System.out.println("(a = b) = " + (a == b));
        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("(a == c = " + (a == c));
        System.out.println("a.equals(c) = " + a.equals(c));
        System.out.println("a.getClass() = " + a);
        System.out.println("c.getClass() = " + c);
        int i = System.identityHashCode(a);
        System.out.println("i = " + i);
        int i1 = System.identityHashCode(b);
        System.out.println("i1 = " + i1);
        int i2 = System.identityHashCode(c);
        System.out.println("i2 = " + i2);

    }
}
