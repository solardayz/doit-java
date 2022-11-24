package chapter11.classex;

public class NewInstanceTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person = new Person();
        System.out.println("person = " + person);

        Class<?> aClass = Class.forName("chapter11.classex.Person");
        Person person1 = (Person) aClass.newInstance();
        System.out.println("person1 = " + person1);
    }
}
