package chapter13.lambda;

public class AddTest {

    public static void main(String[] args) {
        Add addF = (x, y) -> x + y;

        System.out.println("addF = " + addF.add(1,2));
    }
}
