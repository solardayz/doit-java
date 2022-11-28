package chapter12.map;

import chapter12.collection.Member;

import java.util.TreeMap;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        this.treeMap = new TreeMap<>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getId(), member);
    }

    public boolean removeMember(int memberId) {
        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId);
            return true;
        }
        return  false;
    }

    @Override
    public String toString() {
        return "MemberTreeMap{" +
                "treeMap=" + treeMap +
                '}';
    }
}
