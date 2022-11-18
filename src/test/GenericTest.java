package test;

import java.util.Timer;

public class GenericTest {

    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {
//        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
//        Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);
//
//        double rect = GenericTest.<Integer, Double>makeRectangle(p1, p2);
//        System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
        Shape<Tri> circleShape = new Shape<>(new Tri());
        circleShape.shape();

    }
    private static class Star {
        public void shape() {
            System.out.println("Circle.shape");
        }
    }

    private static class Circle extends ShapeCom{

        @Override
        public void shape() {
            System.out.println("Circle.shape");
        }
    }
    private static class Tri extends ShapeCom{

        @Override
        public void shape() {
            System.out.println("Tri.shape");
        }
    }
    private static class Rec extends ShapeCom{

        @Override
        public void shape() {
            System.out.println("Rec.shape");
        }
    }

    private static abstract class ShapeCom {
        public abstract void shape();
    }
    private static class Shape<T extends ShapeCom>{
        private T shape;

        public Shape(T shape) {
            this.shape = shape;
        }
        public T getShape() {
            return shape;
        }

        public void shape() {
            shape.shape();
        }

    }


    private static class Point<T, V> {
        T i;
        V v;
        public Point(T i, V v) {
            this.i = i;
            this.v = v;
        }

        public V getX() {
            return v;
        }

        public V getY() {
            return v;
        }
    }
}
