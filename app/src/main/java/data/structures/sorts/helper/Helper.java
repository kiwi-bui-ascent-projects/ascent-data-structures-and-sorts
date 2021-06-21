package data.structures.sorts.helper;

public class Helper {
    public static void swap(int[] array, int first, int second) {
        int placeholder = array[first];
        array[first] = array[second];
        array[second] = placeholder;
    }
}
