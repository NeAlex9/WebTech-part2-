package laba1.classesAndObjects.overrideMethods;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){
        String s = super.toString();
        s += language;
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof ProgrammerBook) || !super.equals(o)) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) o;
        return level == programmerBook.level &&
                Objects.equals(programmerBook.language, this.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }
}
