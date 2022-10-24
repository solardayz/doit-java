package chapter08.inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {
        CustomerVIP customerVIP = new CustomerVIP(10000, "가나나나", 2000);
        customerVIP.bonusPoint = 100;

        System.out.println("customerVIP = " + customerVIP.calcPrice(10000));
    }
}
