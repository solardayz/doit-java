package chapter09.game;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("달리기 레벨 3");
    }

    @Override
    public void jump() {
        System.out.println("점프레벨 3");
    }

    @Override
    public void turn() {
        System.out.println("턴레벨 3");
    }

    @Override
    public void showLevelMsg() {
        System.out.println("수퍼레벨");
    }
}
