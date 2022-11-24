package test.hashTest;

import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparable<Member>{

    int id;
    String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Member o) {
        int i = this.getId() - o.getId();
        return i;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
