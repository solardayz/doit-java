package chapter15.stream.serialization;

import java.io.*;

class Person2 implements Serializable {
    String name;
    transient String job;

    public Person2() {
    }

    public Person2(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

public class SerializationTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Person2 personLee = new Person2("a", "aaaa");
//		Person2 personAhn = new Person2("b", "bbbb");
//
//		FileOutputStream fos = new FileOutputStream("serial2.out");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//		oos.writeObject(personLee);
//		oos.writeObject(personAhn);
//		oos.close();

        FileInputStream fis = new FileInputStream("serial2.out");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person2 p1 = (Person2)ois.readObject();
        Person2 p2 = (Person2)ois.readObject();

        System.out.println(p1);
        System.out.println(p2);

        ois.close();
    }
}
