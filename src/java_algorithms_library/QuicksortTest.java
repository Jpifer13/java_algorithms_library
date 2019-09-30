package java_algorithms_library;

import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuicksortTest {

    @org.junit.jupiter.api.Test
    void quicksort_integer() {
        final int[] test_int_arr = {3, 6, 34, 1, 8};

        final int[] expected = {1, 3, 6, 8, 34};
        final int[] actual = (new Quicksort(test_int_arr, true)).get_int_array();

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @org.junit.jupiter.api.Test
    void quicksort_double() {
        final double[] test_double_arr = {3.5, 6.0, 34.01, 1.55, 8.9};

        final double[] expected = {1.55, 3.5, 6.0, 8.9, 34.01};
        final double[] actual = (new Quicksort(test_double_arr, true)).get_double_array();

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @org.junit.jupiter.api.Test
    void quicksort_long() {
        final Long[] test_long_arr = {12345L, 17462728517L, 216818648691L, 5546889L, 8215487L};

        final Long[] expected = {12345L, 5546889L, 8215487L, 17462728517L, 216818648691L};
        final Long[] actual = (new Quicksort(test_long_arr, true)).get_long_array();

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }

    @org.junit.jupiter.api.Test
    void quicksort_big() {
        BigInteger a = new BigInteger("23456256");
        BigInteger b = new BigInteger("6254362456");
        BigInteger c = new BigInteger("523555763427");
        BigInteger d = new BigInteger("736573456324");
        BigInteger e = new BigInteger("56245624562456464");
        final BigInteger[] test_bigint_arr = {a, b, c, d, e};

        final BigInteger[] expected = {a, b, c, d, e};
        final BigInteger[] actual = (new Quicksort(test_bigint_arr, true)).get_bigint_array();

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }


    @org.junit.jupiter.api.Test
    void quicksort_float() {
        final float[] test_float_arr = {42.0452742f, 51.1654f, 0.0555f, 5.1056f, 2.2f};

        final float[] expected = {0.0555f, 2.2f, 5.1056f, 42.0452742f, 51.1654f};
        final float[] actual = (new Quicksort(test_float_arr, true)).get_float_array();

        assertEquals(Arrays.toString(actual), Arrays.toString(expected));
    }
}