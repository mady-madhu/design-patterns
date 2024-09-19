package org.example.iterator;

import java.time.LocalDate;
import java.util.Iterator;

import java.time.LocalDate;
import java.util.Iterator;

public class DateRangeIterator implements Iterator<LocalDate> {
    private LocalDate currentDate;
    private final LocalDate endDate;

    public DateRangeIterator(LocalDate startDate, LocalDate endDate) {
        this.currentDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public boolean hasNext() {
        return !currentDate.isAfter(endDate);
    }

    @Override
    public LocalDate next() {
        LocalDate temp = currentDate;
        currentDate = currentDate.plusDays(1); // Add one day to currentDate
        return temp;
    }

    // Factory method to get Iterable for a date range
    public static Iterable<LocalDate> getDateRange(LocalDate startDate, LocalDate endDate) {
        return () -> new DateRangeIterator(startDate, endDate);
    }
}


