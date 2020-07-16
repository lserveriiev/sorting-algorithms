package io.lenur.sort;

public class InsertionSort implements Sortable {
    @Override
    public void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0 && data[j - 1] > data[j]; j--) {
                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
            }
        }
    }
}
