package chapter10.scheduler;

import java.io.IOException;

public class SchedulerMain {

    public static void main(String[] args) throws IOException {
        System.out.println("상당 할당 방식을 선택하시오");
        System.out.println("R 한명씩 차례로");
        System.out.println("L 쉬고 있거나 대기가 가장 작은 상담원에게");
        System.out.println("P 우선선위가 높은 고객 먼저 할당");

        int read = System.in.read();
        Scheduler scheduler;

        if(read == 'R'){
            scheduler = new LeastJob();
        }else if(read == 'L'){
            scheduler = new RoundRobbin();
        }else if(read == 'P'){
            scheduler = new PriorityAllocation();
        }else {
            System.out.println("3가지 중에 선택하세요.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
