package chapter13.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("ccc");
        list.add("aa");
        list.add("bbbbb");

        Stream<String> stream = list.stream();
        stream.forEach(s-> System.out.println("s = " + s));

        list.stream().sorted().forEach(s-> System.out.println("ss = " + s));
        list.stream().filter(s -> s.length() > 2).forEach(s -> System.out.println("sss = " + s));
    }
}
