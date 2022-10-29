package chapter10.interfaceex;

public class CompleteCalc extends Calculator{
    @Override
    public int time(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0) {
            return ERROR;
        }else{
            return num1 / num2;
        }
    }
    
    public void showInfo(){
        System.out.println("Calc 인터페이스 구현");
    }

    @Override
    public void description() {
        super.description();
    }
}
