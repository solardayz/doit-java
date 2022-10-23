package chapter07.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("책1","저자1"));
        library.add(new Book("책2","저자2"));
        library.add(new Book("책3","저자3"));
        library.add(new Book("책4","저자4"));
        library.add(new Book("책5","저자5"));

        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            book.showInfo();
        }

        System.out.println("================");
        for (Book b : library) {
            b.showInfo();
        }
    }
}
