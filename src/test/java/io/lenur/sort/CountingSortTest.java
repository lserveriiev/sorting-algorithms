package io.lenur.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingSortTest {
    private final CountingSort sort = new CountingSort();

    @Test
    void sort() {
        int[] unsorted = {4, 2, 4, 3, 7, 6, 1, 3};
        int[] sorted = {1, 2, 3, 3, 4, 4, 6, 7};
        sort.sort(unsorted);

        Assertions.assertArrayEquals(unsorted, sorted);
    }
}
