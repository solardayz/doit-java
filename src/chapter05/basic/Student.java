package chapter05.basic;

public class Student {
    int studentId;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo(){
        System.out.println(studentName + " , "+address);
    }

    public String getStudentName () {
        return studentName;
    }

    public void setStudentName (String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        // student는 인스턴스 변수
        // 스택 -> student
        // 힙 -> Student 클래스
        Student student = new Student();
        student.setStudentName("테스트");
        System.out.println("student = " + student.getStudentName());
    }

    int add(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    int getTenTotal() {
        int i;
        int total = 0;
        for (i = 0; i <= 10; i++) {
            total +=1;
        }
        return total;
    }
}
