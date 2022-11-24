package chapter11.object;

public class IntegerTest {

    public static void main(String[] args) {
        Integer a = 100;
        int i = a.intValue();
        int i2 = 200;

        int sum = i + i2;
        System.out.println("sum = " + sum);

        int total = a + i2;
        System.out.println("total = " + total);

        Integer aa = i2;
        System.out.println("aa = " + aa);
    }
}
