package chapter10.interfaceex;

public class MyClassMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        X xClass = myClass;
        xClass.x();

        Y yClass = myClass;
        yClass.y();

        MyInterface myInterface = myClass;
        myInterface.myMethod();
        myInterface.x();
        myInterface.y();
    }
}
