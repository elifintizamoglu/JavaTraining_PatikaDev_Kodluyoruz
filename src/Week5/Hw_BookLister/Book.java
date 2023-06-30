package Week5.Hw_BookLister;

public class Book implements Comparable<Book>{

    private String name;
    private String authorName;
    private int pageNumber;

    public Book(String name, String authorName, int pageNumber) {
        this.name = name;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
