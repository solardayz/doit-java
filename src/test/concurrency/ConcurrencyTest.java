package test.concurrency;

import static java.lang.Thread.sleep;

public class ConcurrencyTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("main Start");
        Runnable tokenA = () -> {
            try {
                ConSingleTon.getInstance().makeUUI();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable tokenB = () -> {
            try {
                ConSingleTon.getInstance().makeUUI();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread threadA = new Thread(tokenA);
        threadA.setName("thread-A");
        Thread threadB = new Thread(tokenB);
        threadB.setName("thread-B");

        threadA.start();
//        sleep(200);
        threadB.start();
//        sleep(3000);
        System.out.println("main end");
    }
}
