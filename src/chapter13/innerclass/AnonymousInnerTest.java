package chapter13.innerclass;


class Outer2{
    Runnable getRunnable(int i) {
        int num = 100;
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("i = " + i);
                System.out.println("num = " + num);
            }
        };
    }
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Outer2.run");
        }
    };
}
public class AnonymousInnerTest {

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Runnable runnable = outer2.getRunnable(1111);
        runnable.run();

        outer2.runner.run();
    }
}
