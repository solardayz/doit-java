package chapter07.array;

public class CharArray {

    public static void main(String[] args) {
        char[] alphabets = new char[6];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }

        for (int i = 0; i < alphabets.length; i++) {
            System.out.println("alphabets = " + alphabets[i] + " , " +(int)alphabets[i]);
        }
    }
}
