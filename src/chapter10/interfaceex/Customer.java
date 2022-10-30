package chapter10.interfaceex;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("사다");
    }

    @Override
    public void order() {
        System.out.println("주문");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }
}
