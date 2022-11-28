package chapter12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("가"));
        hashSet.add(new String("나"));
        hashSet.add(new String("다"));
        hashSet.add(new String("라"));

        System.out.println("hashSet = " + hashSet);
    }
}
