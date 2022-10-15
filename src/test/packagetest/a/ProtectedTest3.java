package test.packagetest.a;

import java.util.Arrays;

public class ProtectedTest3 {
    static void test5 () {
        ProtectedTest pt = new ProtectedTest();
        pt.test();
        pt.TEST1 = "1";
        pt.TEST2 = "2";
//        pt.TEST3 = "3";
        pt.TEST4 = "4";
    }

    public static void main(String[] args) {
//        test5();
        ProtectedTest pt = new ProtectedTest();
        System.out.println(pt);
        System.out.println(pt.test5());
        System.out.println(pt.equals(pt.test5()));
        System.out.println(pt == pt.test5());
    }
}
