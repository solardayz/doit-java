package test.hashTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class HashTest {

    public static void main(String[] args) {
//        TreeSet<String> strings = new TreeSet<>();
//        strings.add("가");
//        strings.add("나");
//        strings.add("다");
//        strings.add("라");
//
//        String first = strings.first();
//        System.out.println("first = " + first);
//
//        for (String s : strings) {
//            System.out.println("s = " + s);
//        }
        TreeSet<Member> members = new TreeSet<>();
        members.add(new Member(1, "가나다1"));
        members.add(new Member(2, "가나다2"));
        members.add(new Member(3, "가나다3"));
        members.add(new Member(4, "가나다4"));
        members.add(new Member(5, "가나다5"));
        members.add(new Member(6, "가나다6"));
        members.add(new Member(6, "가나다7"));

        for (Member m : members) {
            System.out.println("m.toString() = " + m.toString());
        }

        Comparator<Object> objectComparator = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
    }
}
