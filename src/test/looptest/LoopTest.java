package test.looptest;

public class LoopTest {


    public static void main(String[] args) {
        String names = "차이이남";
        for(int i = 0 ; i < names.length(); i++) {
            char name = names.charAt(i);
            //첫번째일 경우 그냥 출력
            System.out.println("name = " + name);
            //두번째일 경우 맨 처음을 두번째로 보냄

        }
    }
}
