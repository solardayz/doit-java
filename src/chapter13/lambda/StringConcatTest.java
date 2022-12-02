package chapter13.lambda;

public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatImpl stringConcat = new StringConcatImpl();
        stringConcat.makeString("a", "b");

        StringConcat concat = (x, y) -> System.out.println(" x + \" , \"+y = " + x + " , " + y);
        concat.makeString("aa","bb");

        StringConcat concat1 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(" s1 + \" , \"+s2 = " + s1 + " , " + s2);
            }
        };
        concat1.makeString("aaa","bbb");
    }
}
