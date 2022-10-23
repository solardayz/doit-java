package chapter07.array;

public class ObjectCopy3 {
    public static void main(String[] args) {

        Book[] b1 = new Book[3];
        Book[] b2 = new Book[3];

        b1[0] = new Book("책1", "저자1");
        b1[1] = new Book("책2", "저자2");
        b1[2] = new Book("책3", "저자3");

        b2[0] = new Book();
        b2[1] = new Book();
        b2[2] = new Book();

        for (int i = 0; i < b1.length; i++) {
            b2[i].setBookName(b1[i].getBookName());
            b2[i].setAuthor(b1[i].getAuthor());
        }

        b1[0].setBookName("나목");
        b1[0].setAuthor("박완서");

        System.out.println("========b1===================");
        for (int i = 0; i < b1.length; i++) {
            b1[i].showInfo();
        }
        System.out.println("========b2===================");
        for (int i = 0; i < b2.length; i++) {
            b2[i].showInfo();
        }
    }
}
