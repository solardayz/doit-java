package chapter08.polymorphism;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerID(10000);
        customer.setCustomerName("가나다");
        customer.bonusPoint = 1000;

        CustomerVIP customerVIP = new CustomerVIP(20000, "다다다", 2010);
        customerVIP.bonusPoint = 5000;

        int price = 10000;
        int customerPrice = customer.calcPrice(price);
        System.out.println("customerPrice = " + customerPrice);
        System.out.println("customerPrice = " + customer.showInfo());
        int customerPriceVIP = customerVIP.calcPrice(price);
        System.out.println("customerPriceVIP = " + customerPriceVIP);
        System.out.println("customerPriceVIP = " + customerVIP.showInfo());
    }
}
