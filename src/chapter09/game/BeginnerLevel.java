package chapter09.game;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("달리는 속도 1");
    }

    @Override
    public void jump() {
        System.out.println("점프력 1");
    }

    @Override
    public void turn() {
        System.out.println("턴 레벨 1");
    }

    @Override
    public void showLevelMsg() {
        System.out.println("초보자");
    }
}
