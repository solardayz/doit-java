package chapter08.inheritance;

public class CustomerTest3 {
    public static void main(String[] args) {
        CustomerVIP customerVIP = new CustomerVIP(10020, "가나다", 12345);
        customerVIP.bonusPoint = 100000;
        System.out.println("customerVIP = " + customerVIP.showCustomer());
    }
}
