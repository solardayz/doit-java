package chapter09.template;

public class CarTest {

    public static void main(String[] args) {
        AICar aiCar = new AICar();
        aiCar.run();

        ManualCar manualCar = new ManualCar();
        manualCar.run();
    }
}
