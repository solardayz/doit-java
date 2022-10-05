package chapter05.construct;

public class Person {
    String name;
    float height;
    float weight;

    //디폴트 생성자 -> 만들지 않아서 자바 컴파일 시 자동으로 만들어 준다.
    //그렇지만 아래와 같이 직접 생성자를 만들어 줄 경우 컴파일 오류가 발생한다.
    //생성자가 없는 경우에만 제공됨
    public Person () {}

    public Person(String name) {
        this.name = name;
    }
}
