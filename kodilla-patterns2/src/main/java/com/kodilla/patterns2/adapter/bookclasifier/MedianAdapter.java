package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        int[] years = new int[bookSet.size()];
        int year = 0;
        Iterator<Book> bookIterator = bookSet.iterator();
        while(bookIterator.hasNext()) {
            years[year] = bookIterator.next().getPublicationYear();
            year++;
        }
        Arrays.sort(years);
        return years[years.length / 2];
    }
}
