package chapter10.interfaceex;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int minus(int num1, int num2);
    int time(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        System.out.println("정수 계산기");
        myMethod();
    }

    private void myMethod() {
        System.out.println("private 메소드");
    }

    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    private static void myStaticMethod() {
        System.out.println("private static 메소드");
    }
}
