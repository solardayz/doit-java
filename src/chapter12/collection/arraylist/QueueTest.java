package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyQueue{
    private ArrayList<String> mq = new ArrayList<>();

    void enQ(String data) {
        mq.add(data);
    }

    String deQ() {
        int len = mq.size();
        if (len == 0) {
            return null;
        }
        return mq.remove(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQ("A");
        myQueue.enQ("B");
        myQueue.enQ("C");
        myQueue.enQ("D");

        System.out.println("myQueue.deQ() = " + myQueue.deQ());
        System.out.println("myQueue.deQ() = " + myQueue.deQ());
        System.out.println("myQueue.deQ() = " + myQueue.deQ());
        System.out.println("myQueue.deQ() = " + myQueue.deQ());
    }
}
