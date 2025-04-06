package com.bharath.associationtypes;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        // Creating books inside library - strong ownership
        this.books = new ArrayList<>();
        books.add(new Book("Clean Code"));
        books.add(new Book("Design Patterns"));
    }

    public List<Book> getBooks() {
        return books;
    }
}
