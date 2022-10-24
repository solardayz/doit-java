package chapter08.inheritance;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customer = new Customer(10000, "가나다");
        customer.bonusPoint = 1000;

        CustomerVIP customerVIP = new CustomerVIP(20000, "마마마", 10000);
        customerVIP.bonusPoint = 10000;
        int price = 10000;
        System.out.println("customer = " + customer.calcPrice(price));
        System.out.println("customerVIP = " + customerVIP.calcPrice(price));

    }
}
