package chapter07.arraylist;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjects;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjects = new ArrayList<Subject>();
    }


    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjects.add(subject);
    }
    
    public void showStudentInfo() {
        int total = 0;
        for (Subject s: subjects) {
            total += s.getScorePoint();

            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " +
                    s.getScorePoint() + "입니다.");
        }

        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }
}
