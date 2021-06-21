package data.structures.sorts;

public class MergeSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1, new int[array.length]);
    }

    public static void sort(int[] array, int left, int right, int[] temp) {
        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;
        sort(array, left, middle, temp);
        sort(array, middle + 1, right, temp);
        merge(array, left, right, temp);
    }

    public static void merge(int[] array, int left, int right, int[] temp) {
        int leftEnd = (left + right) / 2;
        int rightStart= leftEnd + 1;
        int leftIndex = left;
        int rightIndex = rightStart;
        int index = left;

        while (leftIndex <= leftEnd && rightIndex <= right) {
            if (array[leftIndex] <= array[rightIndex]) {
                temp[index] = array[leftIndex];
                leftIndex++;
            } else {
                temp[index] = array[rightIndex];
                rightIndex++;
            }
            index++;
        }

        if (leftIndex <= leftEnd) {
            for (int i = leftIndex; i <= leftEnd; i++) {
                temp[index] = array[i];
                index++;
            }
        } else {
            for (int i = rightIndex; i <= right; i++) {
                temp[index] = array[i];
                index++;
            }
        }

        for (int i = left; i <= right; i++) {
            array[i] = temp[i];
        }
    }
}
