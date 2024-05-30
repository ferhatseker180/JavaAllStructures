package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.order_book;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Created TreeSet derived from Set interface
        Set<Book> book = new TreeSet<>();
        // Data added to TreeSet
       book.add(new Book("Fareler Ve İnsanlar","John Steinback",116,1937));
       book.add(new Book("Prens","Niccola Machiavelli",128,1532));
       book.add(new Book("Suç Ve Ceza","Dostoyevski",1152,1866));
       book.add(new Book("Sefiller","Victor Hugo",432,1862));
       book.add(new Book("Hamlet","Shakespeare",222,1601));


       // Books were printed according to the alphabetical order of their names.
        System.out.println("*************Sort By Alphabetical Order***************");
       for (Book b : book){
           System.out.println("Book Name: " + b.getBookName() + " " + " Author: " +
                   b.getAuthorName() + " " + " Page Number: " + b.getPageNumber() +
                   " " + " Publish Time: " + b.getPublishTime());
       }

       // Books were sorted by page numbers and printed.
        System.out.println();
        System.out.println("*************Sort By Number Of Pages***************");
       Set<Book> book2 = new TreeSet<>(Comparator.comparing(Book::getPageNumber));
       book2.addAll(book);
       for (Book p : book2){
           System.out.println("Book Name: " + p.getBookName() + " " + " Author: " +
                   p.getAuthorName() + " " + " Page Number: " + p.getPageNumber() +
                   " " + " Publish Time: " + p.getPublishTime());
       }



    }
}