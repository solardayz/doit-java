package chapter11.object;

class Student{
    int studentId;
    String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EqualsTest {

    public static void main(String[] args) {
        Student s1 = new Student(1, "aaa");
        Student s2 = s1;
        Student s3 = new Student(1, "aaa");

        System.out.println("(s1 == s2) = " + (s1 == s2));
        System.out.println("(s1 == s3) = " + (s1 == s3));
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(s3) = " + s1.equals(s3));

        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
        System.out.println("s3.hashCode() = " + s3.hashCode());

        System.out.println("System.identityHashCode(s1) = " + System.identityHashCode(s1));
        System.out.println("System.identityHashCode(s2) = " + System.identityHashCode(s2));
        System.out.println("System.identityHashCode(s3) = " + System.identityHashCode(s3));

        /*
        *
        *   (s1 == s2) = true
            (s1 == s3) = false
            s1.equals(s2) = true
            s1.equals(s3) = false
            s1.hashCode() = 189568618
            s1.hashCode() = 189568618
            s1.hashCode() = 793589513
        *
        * */

    }
}
