package chapter15.stream.serialization;

import java.io.*;

class Dog implements Externalizable{
    String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
    }
}

public class ExternalizationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog();
        dog.name = "aaaa";

        FileOutputStream fos = new FileOutputStream("external.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try(fos; oos) {
            oos.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = new FileInputStream("external.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog d = (Dog) ois.readObject();
        System.out.println("d = " + d);
    }
}
