package chapter13.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Arrays.stream(arr).forEach(s-> System.out.println("s = " + s));

        
        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);

        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        int sum1 = li.stream().mapToInt(n -> n.intValue()).sum();
        System.out.println("sum1 = " + sum1);

    }
}
