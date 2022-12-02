package chapter14;

public class AutoCloseTest2 {

    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();
        try(obj) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("AutoCloseTest2.main");
        }
    }
}
