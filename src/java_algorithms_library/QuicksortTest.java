package java_algorithms_library;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuicksortTest {

    @org.junit.jupiter.api.Test
    void integer_quicksort() {
        final int[] test_int_arr = {3, 6, 34, 1, 8};

//        final int[] expected = {1, 3, 6, 8, 34};
        final int[] expected = {3, 6, 34, 1, 8};

        final int[] actual = (new Quicksort(test_int_arr, true)).get_int_array();

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }
}