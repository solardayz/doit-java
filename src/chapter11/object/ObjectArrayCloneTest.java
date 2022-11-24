package chapter11.object;

import chapter07.array.ArrayListTest;

import java.util.ArrayList;

class MyBook implements Cloneable{
    String title;

    public MyBook(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectArrayCloneTest {

    public static void main(String[] args) {
        ArrayList<MyBook> arrayList = new ArrayList<>();

        MyBook a = new MyBook("a");
        MyBook b = new MyBook("b");
        MyBook c = new MyBook("c");
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);

        ArrayList<MyBook> clone = (ArrayList)arrayList.clone();
        clone.add(new MyBook("d"));
        System.out.println("arrayList = " + arrayList);
        System.out.println("clone = " + clone);

        c.setTitle("cc");
        System.out.println("arrayList = " + arrayList);
        System.out.println("clone = " + clone);
    }
}
