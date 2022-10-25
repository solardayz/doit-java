package chapter08.polymorphism;


class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move(){
        System.out.println("두발로 걷는다.");
    }
    public void readBook(){
        System.out.println("책을 읽는다.");
    }
}

class Tiger extends Animal {
    public void move(){
        System.out.println("네 발로 뛴다.");
    }
    public void hunting(){
        System.out.println("사냥을 한다.");
    }
}

class Eagle extends Animal{
    public void move() {
        System.out.println("하늘을 난다.");
    }
    public void flying(){
        System.out.println("도구리가 날개를 쭉 펴고 멀리 난다.");
    }
}

public class AnimalTest1 {
    public static void main(String[] args) {
        AnimalTest1 animalTest1 = new AnimalTest1();
        animalTest1.moveAnimal(new Human());
        animalTest1.moveAnimal(new Tiger());
        animalTest1.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
