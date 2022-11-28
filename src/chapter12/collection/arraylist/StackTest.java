package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyStack{
    private ArrayList<String> as = new ArrayList<>();

    public void push(String data) {
        as.add(data);
    }

    public String pop() {
        int len = as.size();
        if(len == 0) {
            return null;
        }
        return(as.remove(len-1));
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("A");
        myStack.push("B");
        myStack.push("c");
        myStack.push("D");

        System.out.println("myStack = " + myStack.pop());
        System.out.println("myStack = " + myStack.pop());
        System.out.println("myStack = " + myStack.pop());
        System.out.println("myStack = " + myStack.pop());
    }
}
