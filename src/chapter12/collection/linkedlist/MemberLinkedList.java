package chapter12.collection.linkedlist;

import chapter12.collection.Member;

import java.util.LinkedList;

public class MemberLinkedList {

    private LinkedList<Member> linkedList;

    public MemberLinkedList() {
        this.linkedList = new LinkedList();
    }

    public void addMember(Member member) {
        linkedList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < linkedList.size(); i++) {

            if(linkedList.get(i).getId() == memberId){
                linkedList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MemberLinkedList{" +
                "linkedList=" + linkedList +
                '}';
    }
}
