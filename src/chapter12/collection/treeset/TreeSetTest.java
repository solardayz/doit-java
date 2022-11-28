package chapter12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");

        System.out.println("treeSet = " + treeSet);
        String a = treeSet.ceiling("A");
        System.out.println("a = " + a);
        String dd = treeSet.ceiling("DD");
        System.out.println("dd = " + dd);
        String first = treeSet.first();
        System.out.println("first = " + first);
        String last = treeSet.last();
        System.out.println("last = " + last);
        boolean dd1 = treeSet.remove("DD");
        System.out.println("dd1 = " + dd1);
        String s = treeSet.pollFirst();
        System.out.println("s = " + s);
        String s1 = treeSet.pollLast();
        System.out.println("s1 = " + s1);
        System.out.println("treeSet = " + treeSet);
    }
}
