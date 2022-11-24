package chapter11.classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class aClass = person.getClass();
        System.out.println("aClass = " + aClass.getName());

        Class personClass = Person.class;
        System.out.println("personClass = " + personClass);

        Class<?> aClass1 = Class.forName("chapter11.classex.Person");
        System.out.println("aClass1.getName() = " + aClass1.getName());
    }
}
