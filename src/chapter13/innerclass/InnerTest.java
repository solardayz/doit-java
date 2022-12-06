package chapter13.innerclass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }
    private class InClass {
        int inNum = 100;
        static int sInNum = 200;
        
        void inTest(){
            System.out.println("InClass.inTest");
            System.out.println("num = " + num);
            System.out.println("sNum = " + sNum);
        }

        static void sTest(){

        }
    }

    public void usingClass(){
        inClass.inTest();
    }
    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;
        
        void inTest(){
//            num += 10;
            System.out.println("inNum = " + inNum);
            System.out.println("sInNum = " + sInNum);
            System.out.println("sNum = " + sNum);
        }

        static void sTest(){
            //num += 10;
            //inNum += 10;

            System.out.println("sNum = " + sNum);
            System.out.println("sInNum = " + sInNum);

        }
    }
}


public class InnerTest {

    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        outClass.usingClass();
//        OutClass.InClass inClass = outClass.new InClass();
    }
}
