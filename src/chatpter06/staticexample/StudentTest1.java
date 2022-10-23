package chatpter06.staticexample;

public class StudentTest1 {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setStudentName("가나다");
        System.out.println(st1.serialNum);
        st1.serialNum++;

        Student st2 = new Student();
        st2.setStudentName("라마바");
        System.out.println(st1.serialNum);
        System.out.println(st2.serialNum);
    }
}
