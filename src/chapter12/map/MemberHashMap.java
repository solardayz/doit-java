package chapter12.map;

import chapter12.collection.Member;

import java.util.HashMap;
import java.util.Set;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        this.hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getId(), member);
    }
    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MemberHashMap{" +
                "hashMap=" + hashMap +
                '}';
    }
}
