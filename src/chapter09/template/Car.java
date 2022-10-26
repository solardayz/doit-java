package chapter09.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public void startCar(){
        System.out.println("시동을 건다.");
    }

    public void stopCar(){
        System.out.println("시동은 끈다.");
    }

    final public void run(){
        startCar();
        drive();
        stop();
        stopCar();
    }
}
