package chatpter06.cooperation;

public class TakeTrans {

    public static void main(String[] args) {

        Student student1 = new Student("JJ", 5000);
        Student student2 = new Student("SS", 15000);

        Bus bus1 = new Bus(100);
        student1.takeBus(bus1);
        student1.showInfo();
        bus1.showInfo();

        Subway subway = new Subway("이호선");
        student2.takeSubway(subway);
        student2.showInfo();
        subway.showInfo();
    }
}
