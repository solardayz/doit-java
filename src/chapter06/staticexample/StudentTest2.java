package chapter06.staticexample;

public class StudentTest2 {

    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.setStudentName(" 가나다");
        System.out.println(st1.serialNum);
        System.out.println(st1.studentName + " , "+st1.studentID);

        Student1 st2 = new Student1();
        st2.setStudentName("라마바");
        System.out.println(st2.serialNum);
        System.out.println(st2.studentName + " , "+st1.studentID);


    }
}
