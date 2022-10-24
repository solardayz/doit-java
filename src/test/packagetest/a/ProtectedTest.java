package test.packagetest.a;

import test.packagetest.b.PublicTest;

public class ProtectedTest {

    protected String TEST1 = "TEST1";
    public String TEST2 = "TEST2";
    final String TEST3 = "TEST3";
    String TEST4 = "TEST4";
    protected void test () {
        System.out.println("protected test");
    }

    void test1 () {
        this.test();
    }

    public void test2 () {
        this.test1();
    }

    public void test3 () {
        this.test2();
        PublicTest pt = new PublicTest();
        pt.publicTest();

    }
    private String test4 () {
        return "test4";
    }

    public ProtectedTest test5 () {
        return this;
    }

    //
}
