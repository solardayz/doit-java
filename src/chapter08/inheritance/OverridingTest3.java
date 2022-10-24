package chapter08.inheritance;

public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;
        Customer customer = new Customer(10000, "가가가가");
        int calcPrice = customer.calcPrice(price);
        System.out.println("calcPrice = " + calcPrice);

        CustomerVIP customerVIP = new CustomerVIP(10000, "나나나나", 2000);
        int calcPrice1 = customerVIP.calcPrice(price);
        System.out.println("calcPrice1 = " + calcPrice1);

        CustomerVIP customerVIP1 = new CustomerVIP(20000, "다다다다", 303030);
        int i = customerVIP1.calcPrice(10000);
        System.out.println("i = " + i);
    }
}
