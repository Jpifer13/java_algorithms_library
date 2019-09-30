package java_algorithms_library;

import java_algorithms_library.Heapsort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapsortTest {


    @org.junit.jupiter.api.Test
    void heapsort_integer() {
        final int[] test_int_arr = {3, 6, 34, 1, 8};

        final int[] expected = {1, 3, 6, 8, 34};
        final int[] actual = (new Heapsort(test_int_arr, true)).get_int_array();
//        System.out.println(Arrays.toString(actual));

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

//    @org.junit.jupiter.api.Test
//    void heapsort_double() {
//        final double[] test_int_arr = {3.5, 6.0, 34.01, 1.55, 8.9};
//
//        final double[] expected = {1.55, 3.5, 6.0, 8.9, 34.01};
//        final double[] actual = (new Heapsort(test_int_arr, true)).get_double_array();
////        System.out.println(Arrays.toString(actual));
//
//        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
//    }
}