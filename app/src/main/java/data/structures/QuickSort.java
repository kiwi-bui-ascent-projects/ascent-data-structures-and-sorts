package data.structures;

public class QuickSort {
    public static void sort(int[] array) {
        split(array, 0, array.length - 1);
    }

    private static void split(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotPoint = (left + right) / 2;
        int midPoint = sort(array, left, right, pivotPoint);
        split(array, left, midPoint - 1);
        split(array, midPoint, right);
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
                int placeholder = array[left];
                array[left] = array[right];
                array[right] = placeholder;

                left++;
                right--;
            }
        }
        return left;
    }
}
