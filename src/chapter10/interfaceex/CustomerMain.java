package chapter10.interfaceex;

public class CustomerMain {

    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

        if(seller instanceof Customer){
            Customer seller1 = (Customer) seller;
            seller1.buy();
            seller1.sell();
        }

        customer.order();
    }
}
