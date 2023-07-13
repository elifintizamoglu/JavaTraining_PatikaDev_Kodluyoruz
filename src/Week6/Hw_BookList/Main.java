package Week6.Hw_BookList;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Book 1", "Author 1", 200, LocalDate.of(2000, 1, 2)));
        books.add(new Book("Book 2", "Author 2", 300, LocalDate.of(2015, 6, 8)));
        books.add(new Book("Book 3", "Author 3", 59, LocalDate.of(2010, 5, 20)));
        books.add(new Book("Book 4", "Author 4", 895, LocalDate.of(2001, 1, 29)));
        books.add(new Book("Book 5", "Author 5", 229, LocalDate.of(2000, 7, 17)));
        books.add(new Book("Book 6", "Author 6", 145, LocalDate.of(2020, 9, 30)));
        books.add(new Book("Book 7", "Author 7", 620, LocalDate.of(2000, 12, 2)));
        books.add(new Book("Book 8", "Author 8", 60, LocalDate.of(2002, 11, 1)));
        books.add(new Book("Book 9", "Author 9", 78, LocalDate.of(2014, 3, 12)));
        books.add(new Book("Book 10", "Author 10", 745, LocalDate.of(2009, 1, 25)));

        TreeMap<String, String> map = new TreeMap<>();
        books.forEach(book -> map.put(book.getBookName(),book.getAuthor()));
        System.out.println("---------All Books---------");
        for(String bookName: map.keySet()){
            System.out.println(bookName + " " + map.get(bookName));
        }

        System.out.println("---------Books with page number more than 100---------");
        List<Book> book100 = books.stream().filter(book -> book.getPageNumber() > 100).toList();
        book100.forEach(book -> System.out.println(book.getBookName() + "---" + book.getPageNumber()));


    }
}
