package Week5.Hw_BookLister;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book("Nutuk", "Mustafa Kemal Atatürk", 600));
        bookSet.add(new Book("Şu Çılgın Türkler","Turgut Özakman",750));
        bookSet.add(new Book("Körlük", "Jose Saramago", 350));
        bookSet.add(new Book("50 Soruda Yapay Zeka", "Cem Say", 200));
        bookSet.add(new Book("Kavgam", "Adolf Hitler", 500));

        System.out.println("Books sorted by their name:");
        for(Book book:bookSet){
            System.out.println(book.getName());
        }

        TreeSet<Book> bookSet2 = new TreeSet<>(new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });

        bookSet2.add(new Book("Nutuk", "Mustafa Kemal Atatürk", 600));
        bookSet2.add(new Book("Şu Çılgın Türkler","Turgut Özakman",750));
        bookSet2.add(new Book("Körlük", "Jose Saramago", 350));
        bookSet2.add(new Book("50 Soruda Yapay Zeka", "Cem Say", 200));
        bookSet2.add(new Book("Kavgam", "Adolf Hitler", 500));

        System.out.println("\nBooks sorted by their page number: ");

        Iterator<Book> itr = bookSet2.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getName());
        }

    }
}
