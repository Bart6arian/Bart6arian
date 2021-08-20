package com.kodilla.testing.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabase;
    @Test
    void testListBooksWithConditionsReturnList() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        bookList.add(book1);
        bookList.add(book3);
        bookList.add(book2);
        bookList.add(book4);
        when(libraryDatabase.listBooksWithCondition("Secret")).thenReturn(bookList);
        //when
        List<Book> theListOfBooks = bookLibrary.listOfBooksWithCondition("Secret");
        //then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int x = 1; x <= booksQuantity; x++) {
            Book theBook = new Book("Title"+x, "Author"+x, 1999 +x);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    void testListBooksWithConditionMoreThan20() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> bookList = new ArrayList<>();
        List<Book> bookListOf15 = generateListOfBooks(15);
        List<Book> bookListOf30 = generateListOfBooks(30);
        when(libraryDatabase.listBooksWithCondition(anyString())).thenReturn(bookListOf15);
        when(libraryDatabase.listBooksWithCondition("Empty")).thenReturn(bookList);
        when(libraryDatabase.listBooksWithCondition("ThirtyBooks")).thenReturn(bookListOf30);
        //when
        List<Book> theListOFBooks15 = bookLibrary.listOfBooksWithCondition("Any");
        List<Book> theListOFBooks = bookLibrary.listOfBooksWithCondition("Empty");
        List<Book> theListOFBooks30 = bookLibrary.listOfBooksWithCondition("ThirtyBooks");
        //then
        assertEquals(15, theListOFBooks15.size());
        assertEquals(0, theListOFBooks.size());
        assertEquals(0, theListOFBooks30.size());

    }
    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        //when
        List<Book> theListOfBooks10 = bookLibrary.listOfBooksWithCondition("An");
        //then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabase, times(0)).listBooksWithCondition(anyString());

    }
    @Mock
    private LibraryUser libraryUser;
 /*   @Test
    void testListBooksInHandsOf0() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUser = new LibraryUser("Fname", "lname", "33567");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> rented = new ArrayList<>();
        List<Book> rented0 = generateListOfBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(rented0);
        //when
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
        //then
        assertEquals(0, result.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(libraryUser);

    }*/

/*    @Test
    void testListBooksInHandsOf1() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Fname", "lname", "33567");
        List<Book> rented = new ArrayList<>();
        List<Book> rented1 = generateListOfBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(rented1);
        //when
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
        //then
        assertEquals(1, result.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(libraryUser);
    }*/
 /*   @Test
    void testListBooksInHandsOf5() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Fname", "lname", "33567");
        List<Book> rented = new ArrayList<>();
        List<Book> rented5 = generateListOfBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(rented5);
        //when
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
        //then
        assertEquals(5, result.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(libraryUser);
    }*/

    @Test
    void testRentABook() {
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Fname", "lname", "4234");
        Book book = new Book("Title", "Author", 1953);
        when(bookLibrary.rentABook(libraryUser, book)).thenReturn(true);
        //when
        boolean result = bookLibrary.rentABook(libraryUser, book);
        //then
        Assertions.assertEquals(true, result);
    }
/*    @Test
    void testReturnBook() {
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("Fname", "lname", "4234");
        List<Book> returned = generateListOfBooks(4);
        int booksReturned = bookLibrary.returnBooks(libraryUser);
        when(bookLibrary.returnBooks(libraryUser)).thenReturn(4);
        //when
        List<Book> toReturn = generateListOfBooks(2);
        //then
        assertEquals(2, 4);
    }*/
}
