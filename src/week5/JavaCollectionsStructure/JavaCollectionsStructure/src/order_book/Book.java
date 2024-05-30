package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.order_book;

public class Book implements Comparable<Book>{
    private String bookName;
    private String authorName;
    private int pageNumber;
    private int publishTime;

    public Book(String bookName, String authorName, int pageNumber, int publishTime) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.publishTime = publishTime;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(int publishTime) {
        this.publishTime = publishTime;
    }


    @Override
    public int compareTo(Book o) {
        return getBookName().compareTo(o.getBookName());
    }
}
