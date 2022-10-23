package chapter06.staticexample;

public class Student {

    public static int serialNum = 1000;
    int StudentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;
//        studentName = "test";
        return serialNum;
    }

    public static void setSerialNum(int serialNum){
        Student.serialNum = serialNum;
    }
}
