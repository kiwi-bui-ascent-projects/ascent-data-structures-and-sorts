package data.structures;

import org.junit.Test;

import static data.structures.QuickSort.sort;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class QuickSortTest {
    @Test
    public void quickSortArrayTest() {
        int[] numbers = {4, 12, 7, 1, 2, 9};
        int[] expected = {1, 2, 4, 7, 9, 12};

        sort(numbers);

        assertThat(numbers, is(expected));
    }
}
