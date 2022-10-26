package chapter09.template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자율주행");
    }

    @Override
    public void stop() {
        System.out.println("자동주차");
    }
}
