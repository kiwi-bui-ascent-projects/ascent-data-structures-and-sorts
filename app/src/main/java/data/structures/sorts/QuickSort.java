package data.structures.sorts;

import static data.structures.sorts.helper.Helper.swap;

public class QuickSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotPoint = (left + right) / 2;
        int midPoint = sort(array, left, right, pivotPoint);
        sort(array, left, midPoint - 1);
        sort(array, midPoint, right);
    }

    private static int sort(int[] array, int left, int right, int pivotPoint) {
        while (left <= right) {
            while (array[left] < array[pivotPoint]) {
                left++;
            }

            while (array[right] > array[pivotPoint]) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);

                left++;
                right--;
            }
        }
        return left;
    }
}
