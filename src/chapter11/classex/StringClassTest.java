package chapter11.classex;

import test.hashTest.Member;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("java.lang.String");

        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor c : constructors ) {
            System.out.println("c = " + c);
        }

        Field[] fields = aClass.getFields();
        for (Field f :fields) {
            System.out.println("f = " + f);
        }

        Method[] methods = aClass.getMethods();
        for(Method m : methods) {
            System.out.println("m = " + m);
        }
    }
}
