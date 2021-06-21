package data.structures.sorts;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MySortTests {
    int[] actualOne = {4, 12, 7, 1, 2, 9};;
    int[] expectedOne = {1, 2, 4, 7, 9, 12};
    int[] actualTwo = {6, 22, 3, 4, 18, 7, 17};
    int[] expectedTwo = {3, 4, 6, 7, 17, 18, 22};

    @Test
    public void quickSortArrayTest() {
        QuickSort.sort(actualOne);
        QuickSort.sort(actualTwo);

        assertThat(actualOne, is(expectedOne));
        assertThat(actualTwo, is(expectedTwo));
    }

    @Test
    public void mergeSortArrayTest() {
        MergeSort.sort(actualOne);
        MergeSort.sort(actualTwo);

        assertThat(actualOne, is(expectedOne));
        assertThat(actualTwo, is(expectedTwo));
    }

    @Test
    public void bubbleSortArrayTest() {
        BubbleSort.sort(actualOne);
        BubbleSort.sort(actualTwo);

        assertThat(actualOne, is(expectedOne));
        assertThat(actualTwo, is(expectedTwo));
    }
}
