package chapter06.thisexample;

class BirthDay {

    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {

    public static void main(String[] args) {
        BirthDay by = new BirthDay();
        by.setYear(2000);
        System.out.println("by = " + by);
        by.printThis();
    }
}