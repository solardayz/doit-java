package chapter06.staticexample;

public class StudentTest4 {

    public static void main(String[] args) {
        Student2 st1 = new Student2();
        st1.setStudentName("aaaa");
        System.out.println(Student2.getSerialNum());
        System.out.println(st1.studentName + " , "+st1.studentID);

        Student2 st2 = new Student2();
        st2.setStudentName("bbbb");
        System.out.println(Student2.getSerialNum());
        System.out.println(st2.studentName + " , "+st2.studentID);
    }
}
