package org.example.iterator;

import java.time.LocalDate;

public class IteratorTest {
    public static void main(String[] args) {
            LocalDate start = LocalDate.of(2023, 1, 1);
            LocalDate end = LocalDate.of(2023, 1, 10);

            // Using the iterable to loop over the date range
            for (LocalDate date : DateRangeIterator.getDateRange(start, end)) {
                System.out.println(date);
            }

    }
}
