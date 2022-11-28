package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {

    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        memberHashSet.addMember(new Member(1, "가"));
        memberHashSet.addMember(new Member(2, "나"));
        memberHashSet.addMember(new Member(3, "다"));
        memberHashSet.addMember(new Member(4, "라"));
        memberHashSet.addMember(new Member(5, "마"));
        memberHashSet.addMember(new Member(3, "마"));

        memberHashSet.removeMember(4);
        System.out.println("memberHashSet = " + memberHashSet.toString());
    }
}
