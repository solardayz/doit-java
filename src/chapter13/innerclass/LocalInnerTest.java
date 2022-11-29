package chapter13.innerclass;

class Outer{
    int outNum = 100;
    int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;
        num = sNum;
        class MyRunnable implements Runnable{
            @Override
            public void run() {
                sNum = 19;
                System.out.println("i = " + i);
                System.out.println("num = " + sNum);
                System.out.println("outNum = " + outNum);
            }
        }
        return new MyRunnable();
    }
}


public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(1);
        runnable.run();
    }
}
