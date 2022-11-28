package chapter12.collection.treeset;

import chapter12.collection.Member;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet mts = new MemberTreeSet();
        mts.addMember(new Member(1, "a"));
//        mts.addMember(new Member(2, "b"));
        mts.addMember(new Member(3, "c"));

        System.out.println("mts = " + mts);
        mts.addMember(new Member(2, "bb"));
        System.out.println("mts = " + mts);
    }
}
