package data.structures.sorts;

import static data.structures.sorts.helper.Helper.swap;

public class BubbleSort {
    public static void sort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }
}
