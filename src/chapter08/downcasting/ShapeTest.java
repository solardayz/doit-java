package chapter08.downcasting;

import javax.sql.rowset.serial.SerialJavaObject;
import java.util.ArrayList;

class Shape{
    void draw() {
        System.out.println("draw Shape");
    }
}

class Circle extends Shape{
    void draw() {
        System.out.println("draw Circle");
    }
    void circle() {
        System.out.println("원 입니다.");
    }
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("draw Rectangle");
    }
    void rectangle() {
        System.out.println("사각형");
    }
}

class Triangle extends Shape{
    void draw() {
        System.out.println("draw Triangle");
    }
    void triangle() {
        System.out.println("삼각형");
    }
}

public class ShapeTest {

    ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {

        ShapeTest shapeTest = new ShapeTest();

        shapeTest.addShape();
        System.out.println("원래 타입으로 다운 캐스팅");
        shapeTest.testCasting();

    }

    private void testCasting() {
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            if(shape instanceof Circle) {
                Circle c = (Circle) shape;
                c.circle();
            }else if(shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                r.rectangle();
            }else if(shape instanceof Triangle) {
                Triangle t = (Triangle) shape;
                t.triangle();
            }else {
                System.out.println("없음");
            }
        }
    }

    private void addShape() {
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        for (Shape s : shapes) {
            s.draw();
        }
    }

}
