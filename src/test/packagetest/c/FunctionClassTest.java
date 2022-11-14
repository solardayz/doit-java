package test.packagetest.c;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionClassTest {

    public static void main(String[] args) {
        Function<Integer, Integer> get10Pint = integer -> integer + 100;

        Integer apply = get10Pint.apply(10);
        System.out.println("apply = " + apply);




        List<String> strings = Arrays.asList("a","b","C","D","e","f");
        Consumer<String> stringConsumer = i -> new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + " 입니다.";
            }
        };
    }
}
