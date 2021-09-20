package laba1.classesAndObjects.overrideMethods;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int compareTo(Book p){
        if (this.isbn > p.isbn){
            return 1;
        }
        else if(this.isbn < p.isbn){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return title + "(" + author + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author, this.price);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return this.price == book.price &&
                Objects.equals(this.title, book.title) &&
                Objects.equals(this.author, book.author);
    }

    @Override
    public Object clone(){
        return new Book(this.title, this.author, this.price);
    }
}
