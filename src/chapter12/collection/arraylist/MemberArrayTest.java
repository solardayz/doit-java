package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayTest {

    public static void main(String[] args) {
        MemberArrayList ml = new MemberArrayList();

        ml.addMember(new Member(1, "AAA"));
        ml.addMember(new Member(2, "BBB"));
        ml.addMember(new Member(3, "CCC"));
        ml.addMember(new Member(4, "DDD"));
        ml.addMember(new Member(5, "EEE"));

        ml.removeMember(1);

        System.out.println("ml = " + ml.toString());
    }
}
