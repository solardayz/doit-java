package chapter12.map;

import chapter12.collection.Member;

import java.util.*;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap treeMap = new MemberTreeMap();
        treeMap.addMember(new Member(1, "a"));
        treeMap.addMember(new Member(2, "b"));
        treeMap.addMember(new Member(3, "c"));
        treeMap.addMember(new Member(4, "d"));
        System.out.println("treeMap = " + treeMap);
        treeMap.addMember(new Member(3, "cc"));
        System.out.println("treeMap = " + treeMap);
        treeMap.removeMember(1);
        System.out.println("treeMap = " + treeMap);

        TreeMap<Integer, String> ist = new TreeMap<>();
        ist.put(1, "a");
        ist.put(2, "b");
        ist.put(3, "c");
        ist.put(4, "d");
        ist.put(5, "e");
        boolean b = ist.containsKey(3);
        System.out.println("b = " + b);
        Comparator<? super Integer> comparator = ist.comparator();
        System.out.println("comparator = " + comparator);
        Map.Entry<Integer, String> integerStringEntry = ist.ceilingEntry(2);
        System.out.println("integerStringEntry = " + integerStringEntry);
        Integer integer = ist.ceilingKey(4);
        System.out.println("integer = " + integer);
        NavigableSet<Integer> integers = ist.descendingKeySet();
        System.out.println("integers = " + integers);
        Set<Map.Entry<Integer, String>> entries = ist.entrySet();
        System.out.println("entries = " + entries);
    }
}
