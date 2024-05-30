package week4.JavaOOPAndGenerics.src.oop.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Ferhat","Ferhat'ın günlüğü",100);


        book1.setBookName("Ferhat'ın makalesi");
        System.out.println( book1.getBookName());

        book1.setPageNumber(1000);
        System.out.println(book1.getPageNumber());

    }
}
