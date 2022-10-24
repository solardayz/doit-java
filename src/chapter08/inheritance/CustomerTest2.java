package chapter08.inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        CustomerVIP customerVIP = new CustomerVIP();
        customerVIP.setCustomerID(100000);
        customerVIP.setCustomerName("가나라");
        customerVIP.bonusPoint = 10000;
        System.out.println("customerVIP = " + customerVIP.showCustomer());
    }
}
