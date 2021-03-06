package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Statistics statistics = new Statistics();
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
        for(com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book : bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book book1 =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(),
                            book.getTitle(), book.getPublicationYear());
            bookMap.put(new BookSignature(book.getSignature()), book1);
        }
        return medianPublicationYear(bookMap);
    }
}
