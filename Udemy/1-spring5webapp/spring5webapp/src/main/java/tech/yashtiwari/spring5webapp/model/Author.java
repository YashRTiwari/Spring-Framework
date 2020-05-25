package tech.yashtiwari.spring5webapp.model;

import java.util.Set;

public class Author {

    private String fName;
    private String lName;
    private Set<Book> books;

    public Author() {
    }

    public Author(String fName, String lName, Set<Book> books) {
        this.fName = fName;
        this.lName = lName;
        this.books = books;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
