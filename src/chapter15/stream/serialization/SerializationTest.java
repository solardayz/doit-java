package chapter15.stream.serialization;

import java.io.*;

public class SerializationTest {

static class Person implements Serializable{
    String name;
    transient String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

    public static void main(String[] args) {
        Person p1 = new Person("a", "aa");
        Person p2 = new Person("b", "bb");
        System.out.println("p1 = " + p1);
        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(p1);
            oos.writeObject(p2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Person person1 = (Person) ois.readObject();
            System.out.println("person1 = " + person1);
            Person person2 = (Person) ois.readObject();
            System.out.println("person2 = " + person2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
