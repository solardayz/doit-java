package chapter10.scheduler;

public class RoundRobbin implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("순서대로 가져옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("순서대로 할당");
    }
}
