package chapter07.arraylist;

public class StudentTest {


    public static void main(String[] args) {
        Student st1 = new Student(1001, "Jim");
        st1.addSubject("math", 50);
        st1.addSubject("science", 100);

        Student st2 = new Student(1002, "May");
        st2.addSubject("math", 100);
        st2.addSubject("science", 90);
        st2.addSubject("korean", 80);

        st1.showStudentInfo();
        st2.showStudentInfo();
    }
}
