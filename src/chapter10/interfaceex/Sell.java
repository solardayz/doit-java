package chapter10.interfaceex;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("주문");
    }
}
