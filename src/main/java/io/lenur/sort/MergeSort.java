package io.lenur.sort;

public class MergeSort implements Sortable {
    @Override
    public void sort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private void sort(int[] data, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(data, left, middle);
            sort(data, middle + 1, right);

            merge(data, left, middle, right);
        }
    }

    private void merge(int[] data, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] lData = new int[n1];
        int[] rData = new int[n2];

        if (n1 >= 0) {
            System.arraycopy(data, left, lData, 0, n1);
        }

        for (int j = 0; j < n2; j++) {
            rData[j] = data[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (lData[i] <= rData[j]) {
                data[k] = lData[i];
                i++;
            } else {
                data[k] = rData[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = lData[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = rData[j];
            j++;
            k++;
        }
    }
}
