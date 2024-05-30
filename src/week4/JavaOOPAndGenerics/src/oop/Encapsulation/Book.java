package week4.JavaOOPAndGenerics.src.oop.Encapsulation;

public class Book {
    private int pageNumber;
    private String author, bookName;

    Book(String author, String bookName, int pageNumber) {
        this.author = author;
        this.bookName = bookName;
          if (pageNumber <= 0){
            this.pageNumber = 10;
          } else {
        this.pageNumber = pageNumber;
          }
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber <= 0) {
            this.pageNumber = 10;
        } else {
            this.pageNumber = pageNumber;
        }

    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


}
