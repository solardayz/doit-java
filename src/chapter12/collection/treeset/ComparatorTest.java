package chapter12.collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyComparable implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        System.out.println("strings = " + strings);

    };
}
