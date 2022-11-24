package chapter11.object;

public class StringEqualsTest {

    public static void main(String[] args) {
        String a1 = new String("abc");
        String a2 = new String("abc");

        System.out.println("a1 = a2 = " + (a1 == a2));

        System.out.println("a1.equals(a2) = " + a1.equals(a2));

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("(i1+i2) = " + (i1 == i2));
        System.out.println("i1.equals(i2) = " + i1.equals(i2));
    }
}
