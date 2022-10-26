package chapter09.finalTest;

public class Constant {
    int num = 10;
    final int NUM = 100;

    public static void main(String[] args) {
        Constant constant = new Constant();
        constant.num = 50;
//        constant.NUM = 100;

        System.out.println(constant.num);
        System.out.println(constant.NUM);
    }
}
