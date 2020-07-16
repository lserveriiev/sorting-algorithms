package io.lenur.sort;

public class QuickSort implements Sortable {
    @Override
    public void sort(int[] data) {
        sort(data, 0, data.length-1);
    }

    private void sort(int[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);

            sort(data, low, pi - 1);
            sort(data, pi + 1, high);
        }
    }

    private int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;

                //swap
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
}
