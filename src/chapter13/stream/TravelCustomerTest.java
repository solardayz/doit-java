package chapter13.stream;

import java.util.ArrayList;

public class TravelCustomerTest {

    public static void main(String[] args) {
        TravelCustomer a = new TravelCustomer("a", 10, 100);
        TravelCustomer b = new TravelCustomer("b", 20, 100);
        TravelCustomer c = new TravelCustomer("c", 30, 500);

        ArrayList<TravelCustomer> travelCustomers = new ArrayList<>();
        travelCustomers.add(a);
        travelCustomers.add(b);
        travelCustomers.add(c);
        
        travelCustomers.stream().map(t->t.getName()).forEach(s-> System.out.println("s = " + s));

        travelCustomers.stream().mapToInt(p -> p.getPrice()).forEach(s-> System.out.println("price = " + s));

        travelCustomers.stream().filter(age-> age.getAge() > 20).map(name-> name.getName()).sorted().forEach(s-> System.out.println("name = " + s));
    }
}
