package Week6.Hw_BookList;

import java.time.LocalDate;

public class Book {
    private String bookName;
    private String author;
    private int pageNumber;
    private LocalDate publishDate;

    public Book(String bookName, String author, int pageNumber, LocalDate publishDate) {
        this.bookName = bookName;
        this.author = author;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}
