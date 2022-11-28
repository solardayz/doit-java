package chapter12.map;

import chapter12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap hashMap = new MemberHashMap();
        hashMap.addMember(new Member(1, "a"));
        hashMap.addMember(new Member(2, "b"));
        hashMap.addMember(new Member(3, "c"));
        hashMap.addMember(new Member(4, "d"));

        hashMap.addMember(new Member(2, "bb"));
        System.out.println("hashMap = " + hashMap);
        
        hashMap.removeMember(3);
        System.out.println("hashMap = " + hashMap);
    }
}
