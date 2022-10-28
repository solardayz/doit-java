package chapter10.scheduler;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 고객 전화 먼저 가저옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬이 가장 높은 상담원에게 할당");
    }
}
