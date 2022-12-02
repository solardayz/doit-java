package chapter13.lambda;

interface PrintString{
    void showString(String str);
}

public class LambdaTest {

    public static void main(String[] args) {
        PrintString str = s -> System.out.println("s = " + s);
        str.showString("aaaaaa");
        showMyString(str);

        PrintString reStr = returnString();
        reStr.showString("bbbbb");
    }

    private static PrintString returnString() {
        return str -> System.out.println("str = " + str);
    }

    private static void showMyString(PrintString str) {
        str.showString("str");
    }
}
