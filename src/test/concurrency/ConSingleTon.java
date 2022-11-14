package test.concurrency;

import java.util.UUID;

import static java.lang.Thread.sleep;

public class ConSingleTon {

    public static ConSingleTon getInstance() {
        return MakeInstance.INSTANCE;
    }

    private static class MakeInstance {
        public static final ConSingleTon INSTANCE = new ConSingleTon();
    }
    private static String uuid = null;
    public String makeUUI() throws InterruptedException {
        String uuid = getUuid();
        sleep(50);

        System.out.println("리턴 uuid = " + uuid+ "   getInstance = "+getInstance() + "  Thread = "+Thread.currentThread().getName());
        return uuid;
    }

    private String getUuid() {
        String uuid = UUID.randomUUID().toString().substring(0, 8);
        System.out.println("조회 uuid = " + uuid+ "   getInstance = "+getInstance() + "  Thread = "+Thread.currentThread().getName());
        return uuid;
    }
}
