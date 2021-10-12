package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library = new Library("Library set");
        IntStream.iterate(1, n -> n +1)
                .limit(7)
                .forEach(n -> library.getBooks().add(new Book("book"+n, "author x",
                        LocalDate.ofYearDay(1994, 21))));

        //shallow copy
        Library shallowCopyOfLibrary = null;
        try {
            shallowCopyOfLibrary = library.shallowCopy();
            shallowCopyOfLibrary.setName("shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // deep copy
        Library deepCopyOfLibrary = null;
        try {
            deepCopyOfLibrary = library.deepCopy();
            deepCopyOfLibrary.setName("deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        deepCopyOfLibrary.getBooks().clear();

        //then
        System.out.println(library);
        System.out.println(shallowCopyOfLibrary);
        System.out.println(deepCopyOfLibrary);
        assertEquals(7, library.getBooks().size());
        assertNotEquals(6, shallowCopyOfLibrary.getBooks().size());
        assertEquals(0, deepCopyOfLibrary.getBooks().size());
    }
}
