package chapter12.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(0, "C");
        boolean a = linkedList.contains("A");
        System.out.println("a = " + a);
        linkedList.addFirst("AA");
        System.out.println("linkedList = " + linkedList);
        linkedList.addLast("AAA");
        System.out.println("linkedList = " + linkedList);
    }
}
