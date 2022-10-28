package chapter10.bookshelf;

public class BookShelfMain {

    public static void main(String[] args) {
        Queue bookShelf = new BookShelf();
        bookShelf.enQueue("1");
        bookShelf.enQueue("2");
        bookShelf.enQueue("3");
        bookShelf.enQueue("4");

        System.out.println("bookShelf.deQueue() = " + bookShelf.deQueue());
        System.out.println("bookShelf.deQueue() = " + bookShelf.deQueue());
        System.out.println("bookShelf.deQueue() = " + bookShelf.deQueue());
        System.out.println("bookShelf.deQueue() = " + bookShelf.deQueue());
    }
}
