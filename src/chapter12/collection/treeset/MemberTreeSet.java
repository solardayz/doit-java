package chapter12.collection.treeset;

import chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    TreeSet<Member> ts;

    public MemberTreeSet() {
        this.ts = new TreeSet<>();
    }

    public void addMember(Member member) {
        ts.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> it = ts.iterator();
        while (it.hasNext()) {
            Member member = it.next();
            if(member.getId() == memberId){
                ts.remove(member);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MemberTreeSet{" +
                "ts=" + ts +
                '}';
    }
}
