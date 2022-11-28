package chapter12.map;

import chapter12.collection.Member;

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
    }
}
