package chapter12.collection.arraylist;

import chapter12.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> m;

    public MemberArrayList() {
        this.m = new ArrayList<>();
    }

    public void addMember(Member member) {
        m.add(member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < m.size(); i++) {
            Member member = m.get(i);
            if ( member.getId() == memberId ) {
                m.remove(i);
                return true;
            }
        }
        return false;

        //다른 방법
        /*
        Iterator<Member> iterator = m.iterator();
        while (iterator.hasNext()) {
            Member next = iterator.next();
            int id = next.getId();
            if(id == memberId) {
                m.remove(next);
                return true;
            }
        }
         */
    }

    @Override
    public String toString() {
        return "MemberArrayList{" +
                "m=" + m +
                '}';
    }
}
