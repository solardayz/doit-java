package chapter09.template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("스틱으로 감");
    }

    @Override
    public void stop() {
        System.out.println("수동주차");
    }
}
