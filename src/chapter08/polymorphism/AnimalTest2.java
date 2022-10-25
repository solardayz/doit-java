package chapter08.polymorphism;

import java.util.ArrayList;

public class AnimalTest2 {

    ArrayList<Animal> animals = new ArrayList<Animal>();

    public static void main(String[] args) {
        AnimalTest2 animalTest2 = new AnimalTest2();
        animalTest2.addAnimal();
        System.out.println("다운 캐스팅");
        animalTest2.testCasting();
    }

    private void testCasting() {
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            if(animal instanceof Human){
                Human human = (Human) animal;
                human.readBook();
            }else if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }else if(animal instanceof Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }else{
                System.out.println("없음");
            }
        }
    }

    private void addAnimal() {
        animals.add(new Human());
        animals.add(new Tiger());
        animals.add(new Eagle());
        
        for (Animal animal : animals) {
            animal.move();
        }
    }
}
