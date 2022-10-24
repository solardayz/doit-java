package chapter08.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerID(10000);
        customer1.setCustomerName("가나다");
        customer1.bonusPoint = 1000;
        System.out.println("customer1 = " + customer1.showCustomer());

        Customer customer2 = new Customer();
        customer2.setCustomerID(20000);
        customer2.setCustomerName("라마바");
        customer2.bonusPoint = 20000;
        System.out.println("customer2 = " + customer2.showCustomer());
    }
}
