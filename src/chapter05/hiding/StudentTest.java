package chapter05.hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        // 오류가 발생한다.
        student.studentName = "테스트";
    }
}
