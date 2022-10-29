package chapter10.interfaceex;

public class CalculatorMain {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc completeCalc = new CompleteCalc();
        int add = completeCalc.add(num1, num2);
        int minus = completeCalc.minus(num1, num2);
        int time = completeCalc.time(num1, num2);
        int divide = completeCalc.divide(num1, num2);
        completeCalc.showInfo();

        Calc newCalc = completeCalc;

        newCalc.description();

        int[] arr = {1,2,3,4,5,6};
        System.out.println(Calc.total(arr));
    }
}
