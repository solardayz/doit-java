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

    public String makeUUI() throws InterruptedException {
        System.out.println("getInstance = "+getInstance());
        String uuid = getUuid();
        sleep(1000);
        System.out.println("uuid = " + uuid+ "   getInstance = "+getInstance());
        return uuid;
    }

    private String getUuid() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
