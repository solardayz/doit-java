package chapter11.object;

public class ArrayCloneTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2;

        arr2 = arr;

        for (int num : arr2) {
            System.out.println("num = " + num);
        }

        arr2[3] = 0;
        for(int num : arr) {
            System.out.println("num = " + num);
        }


        for(int num : arr2) {
            System.out.println("num = " + num);
        }
    }
}
