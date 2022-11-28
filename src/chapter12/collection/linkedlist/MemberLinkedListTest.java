package chapter12.collection.linkedlist;

import chapter12.collection.Member;

public class MemberLinkedListTest {

    public static void main(String[] args) {
        MemberLinkedList memberLinkedList = new MemberLinkedList();
        memberLinkedList.addMember(new Member(1, "가"));
        memberLinkedList.addMember(new Member(2, "나"));
        memberLinkedList.addMember(new Member(3, "다"));

        memberLinkedList.removeMember(2);
        System.out.println("memberLinkedList = " + memberLinkedList.toString());
    }
}
