package chapter14;

public class AutoCloseObj implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseObj.close");
    }
}
