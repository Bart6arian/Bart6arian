package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listOfBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if(titleFragment.length() < 3) return bookList;
        List<Book> resultBookList = libraryDatabase.listBooksWithCondition(titleFragment);
        if(resultBookList.size() > 20) return bookList;
        bookList = resultBookList;
        return bookList;
    }
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> booksOutOfLibrary = libraryDatabase.listBooksInHandsOf(libraryUser);
        return booksOutOfLibrary;
    }

    boolean rentABook(LibraryUser libraryUser, Book book) {
        boolean result = false;
        if(libraryDatabase.rentABook(libraryUser, book)) {
            result = true;
        }
        return result;
    }

    int returnBooks(LibraryUser libraryUser) {
        int returned;
        List<Book> returnedBooks = new ArrayList<>();
            for(int x = 0; x <= returnedBooks.size(); x++) {
                returnedBooks.get(x);
            }
        return 0;
    }
}
