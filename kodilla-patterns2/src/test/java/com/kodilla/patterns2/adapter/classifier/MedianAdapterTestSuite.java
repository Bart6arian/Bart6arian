package com.kodilla.patterns2.adapter.classifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    Set<Book> bookSet = new HashSet<>();
    Book book = new Book("author0", "title0", 1999, "rwr342");
    Book book1 = new Book("author1", "title1", 1977, "rwr362");
    Book book2 = new Book("author2", "title2", 2009, "rwr242");
    Book book3 = new Book("author3", "title3", 2009, "rwr241");

    @Test
    public void publicationYearMedianTest() {
        //given
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book);
        MedianAdapter ma = new MedianAdapter();
        //when
        int expectedMedian = ma.publicationYearMedian(bookSet);
        //then
        assertEquals(expectedMedian, 2009);

    }
}
