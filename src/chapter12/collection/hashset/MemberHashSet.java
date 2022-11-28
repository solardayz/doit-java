package chapter12.collection.hashset;

import chapter12.collection.Member;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> m;

    public MemberHashSet() {
        this.m = new HashSet<>();
    }

    public void addMember(Member member) {
        m.add(member);
    }

    boolean removeMember(int memberId) {
        Iterator<Member> iterator = m.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getId() == memberId) {
                m.remove(member);
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MemberHashSet{" +
                "m=" + m +
                '}';
    }
}
