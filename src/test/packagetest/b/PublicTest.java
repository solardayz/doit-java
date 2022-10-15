package test.packagetest.b;

import test.packagetest.a.ProtectedTest;

public class PublicTest {

    public static void main(String[] args) {
        ProtectedTest pt = new ProtectedTest();
    }

    public void publicTest () {
        System.out.println("PublicTest");
    }
}
