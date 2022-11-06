package test.algo;

import java.util.Arrays;

public class SumNotExgistNumbers {
    public static void main(String[] args) {
        int numbers[] = {5,8,4,0,6,7,9};

        Arrays.sort(numbers);
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers = " + numbers[i]);

        }
        System.out.println("answer = " + answer);
    }
}
