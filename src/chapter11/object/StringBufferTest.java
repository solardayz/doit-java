package chapter11.object;

public class StringBufferTest {

    public static void main(String[] args) {
        String aaaa = new String("aaaa");

        System.out.println("aaaa = " + aaaa);

        StringBuffer stringBuffer = new StringBuffer(aaaa);
        System.out.println("System.identityHashCode(stringBuffer) = " + System.identityHashCode(stringBuffer));

        stringBuffer.append(" bbbb");
        stringBuffer.append(" cccc");
        stringBuffer.append(" dddd");
        System.out.println("System.identityHashCode(stringBuffer) = " + System.identityHashCode(stringBuffer));

        String s = stringBuffer.toString();
        System.out.println("s = " + s);

        System.out.println("System.identityHashCode(stringBuffer) = " + System.identityHashCode(s));
    }
}
