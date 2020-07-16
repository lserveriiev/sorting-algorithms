package io.lenur.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SelectionSortTest {
    private final SelectionSort sort = new SelectionSort();

    @Test
    void sort() {
        int[] unsorted = {4, 2, 3, 5, 7, 6, 1};
        int[] sorted = {1, 2, 3, 4, 5, 6, 7};
        sort.sort(unsorted);

        Assertions.assertArrayEquals(unsorted, sorted);
    }
}
