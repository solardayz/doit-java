package chapter06.cooperation;

public class Subway {
    public String lineNum;
    public int passengerCnt;
    public int money;

    public Subway(String lineNum) {
        this.lineNum = lineNum;
    }

    public void take(int money) {
        this.money += money;
        passengerCnt++;
    }

    public void showInfo() {
        System.out.println(lineNum + "의 승객은 " + passengerCnt +"명이고, 수입은 " + money + "입니다.");
    }
}
