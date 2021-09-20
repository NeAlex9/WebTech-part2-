package laba1.classesAndObjects.сomparators;

import laba1.classesAndObjects.overrideMethods.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    public int compare(Book book1, Book book2){
        if (book1.getPrice() > book2.getPrice()){
            return 1;
        }
        else if(book1.getPrice() < book2.getPrice()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
