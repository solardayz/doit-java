package chatpter06.staticexample;

public class StudentTest3 {

    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.setStudentName("1111");
        System.out.println(Student1.serialNum);
        System.out.println(st1.studentName + " ,"+st1.studentID);


        Student1 st2 = new Student1();
        st2.setStudentName("2222");
        System.out.println(Student1.serialNum);
        System.out.println(st2.studentName + " ,"+st2.studentID);


    }
}
