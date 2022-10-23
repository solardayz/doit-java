package chatpter06.thisexample;

class Person{
    String name;
    int age;

    Person(){
        this("홍길동", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person returbSelf() {
        return this;
    }
}

public class CallAnotherConst {

    public static void main(String[] args) {
        Person ps = new Person();
        System.out.println(ps.name);
        System.out.println(ps.age);

        Person person = ps.returbSelf();
        System.out.println("person = " + person);
        System.out.println(ps);
    }

}
