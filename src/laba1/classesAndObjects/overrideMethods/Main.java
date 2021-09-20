package laba1.classesAndObjects.overrideMethods;

import laba1.classesAndObjects.сomparators.AuthorComparator;
import laba1.classesAndObjects.сomparators.PriceComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Aoyling", 1233);
        Book book2 = new Book("Harry Potter", "Royling", 12);
        ArrayList<Book> lst = new ArrayList<>();
        lst.add(book2);
        lst.add(book1);
        lst.sort(new AuthorComparator().thenComparing(new AuthorComparator()).thenComparing(new PriceComparator()));
        for(Book  p : lst){
            System.out.println(p.getPrice());
        }
    }
}