package chapter10.interfaceex;

public class MyClass implements MyInterface{

    @Override
    public void myMethod() {
        System.out.println("MyClass.myMethod");
    }

    @Override
    public void x() {
        System.out.println("MyClass.x");
    }

    @Override
    public void y() {
        System.out.println("MyClass.y");
    }
}
