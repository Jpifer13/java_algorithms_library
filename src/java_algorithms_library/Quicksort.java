package java_algorithms_library;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Quicksort {
    private int[] int_arr;
    private float[] float_arr;
    private double[] double_arr;
    private BigInteger[] bigint_arr;
    private Long[] long_arr;
    private String[] string_arr;
    private boolean order;// True is descending False is ascending
    
    /**
     * These are the constructors for six different array types
     * @param incoming_array This incoming array and its type
     * @param ord The order that we wnat to sort the array True ascending false descending
     */
    Quicksort(int[] incoming_array, boolean ord){
        int_arr = incoming_array;
        order = ord;
//        int_sort(Arrays.copyOf(int_arr, int_arr.length), 0, (int_arr.length - 1));
        int_sort(int_arr, 0, (int_arr.length - 1));
        string_arr = new String[int_arr.length];
        for(int i = 0; i < int_arr.length; i++){
            string_arr[i] = String.valueOf(int_arr[i]);
        }
        if(order == false){
            string_arr = Helpers.reverse_array(string_arr);
        }
    }

    Quicksort(float[] incoming_array, boolean ord){
        float_arr = incoming_array;
        order = ord;
        float_sort(float_arr, 0, (float_arr.length - 1));
        string_arr = new String[float_arr.length];
        for(int i = 0; i < float_arr.length; i++){
            string_arr[i] = String.valueOf(float_arr[i]);
        }
        if(order == false){
            string_arr = Helpers.reverse_array(string_arr);
        }
    }

    Quicksort(double[] incoming_array, boolean ord){
        double_arr = incoming_array;
        order = ord;
        double_sort(double_arr, 0, (double_arr.length - 1));
        string_arr = new String[double_arr.length];
        for(int i = 0; i < double_arr.length; i++){
            string_arr[i] = String.valueOf(double_arr[i]);
        }
        if(order == false){
            string_arr = Helpers.reverse_array(string_arr);
        }
    }

    Quicksort(Long[] incoming_array, boolean ord){
        long_arr = incoming_array;
        order = ord;
        long_sort(long_arr, 0, (long_arr.length - 1));
        string_arr = new String[long_arr.length];
        for(int i = 0; i < long_arr.length; i++){
            string_arr[i] = String.valueOf(long_arr[i]);
        }
        if(order == false){
            string_arr = Helpers.reverse_array(string_arr);
        }
    }

    Quicksort(BigInteger[] incoming_array, boolean ord){
        bigint_arr = incoming_array;
        order = ord;
        bigint_sort(bigint_arr, 0, (bigint_arr.length - 1));
        string_arr = new String[bigint_arr.length];
        for(int i = 0; i < bigint_arr.length; i++){
            string_arr[i] = String.valueOf(bigint_arr[i]);
        }
        if(order == false){
            string_arr = Helpers.reverse_array(string_arr);
        }
    }

    Quicksort(String[] incoming_array, boolean ord){
        string_arr = incoming_array;
        order = ord;
        System.out.print(string_arr);
    }

    public int[] get_int_array(){
        return int_arr;
    }
    public double[] get_double_array(){
        return double_arr;
    }
    public float[] get_float_array(){
        return float_arr;
    }
    public Long[] get_long_array(){
        return long_arr;
    }
    public BigInteger[] get_bigint_array(){
        return bigint_arr;
    }
    public String[] get_string_array(){
        return string_arr;
    }
    public boolean get_ord(){
        return order;
    }

    /**
     * This is used if constructor for string array is called to check if it can 
     * be turned it into a number data type, int, double, float, etc..
     */
    private void string_array_to_other(){
        if(Helpers.validate_integer_array(string_arr)){
            int_arr = new int[string_arr.length];
            for(int i = 0;i < string_arr.length;i++){
                int_arr[i] = Integer.parseInt(string_arr[i]);
            }
        }
        else if(Helpers.validate_double_array(string_arr)){
            double_arr = new double[string_arr.length];
            for(int i = 0;i < string_arr.length;i++){
                double_arr[i] = Double.parseDouble(string_arr[i]);
            }
        }
        else if(Helpers.validate_float_array(string_arr)){
            float_arr = new float[string_arr.length];
            for(int i = 0;i < string_arr.length;i++){
                float_arr[i] = Float.parseFloat(string_arr[i]);
            }
        }
        else if(Helpers.validate_long_array(string_arr)){
            long_arr = new Long[string_arr.length];
            for(int i = 0;i < string_arr.length;i++){
                long_arr[i] = Long.parseLong(string_arr[i]);
            }
        }
        else if(Helpers.validate_bigint_array(string_arr)){
            bigint_arr = new BigInteger[string_arr.length];
            for(int i = 0;i < string_arr.length;i++){
                bigint_arr[i] = new BigInteger(string_arr[i]);
            }
        }
    }

    /**
     *
     * @param low starting index
     * @param high ending index
     */
    private void int_sort(int[] new_arr, int low, int high){
        if(low < high){
            int part_index = int_partition(new_arr, low, high);

            int_sort(new_arr, low,part_index-1);
            int_sort(new_arr,part_index+1, high);
        }

    }

    /**
     *
     * @param low starting index
     * @param high ending index
     */
    private void double_sort(double[] new_arr, int low, int high){
        if(low < high){
            int part_index = double_partition(new_arr, low, high);

            double_sort(new_arr, low,part_index-1);
            double_sort(new_arr,part_index+1, high);
        }
    }

    /**
     *
     * @param low starting index
     * @param high ending index
     */
    private void float_sort(float[] new_arr, int low, int high){
        if(low < high){
            int part_index = float_partition(new_arr, low, high);

            float_sort(new_arr, low,part_index-1);
            float_sort(new_arr,part_index+1, high);
        }
    }

    /**
     *
     * @param low starting index
     * @param high ending index
     */
    private void long_sort(Long[] new_arr, int low, int high){
        if(low < high){
            int part_index = long_partition(new_arr, low, high);

            long_partition(new_arr, low,part_index-1);
            long_partition(new_arr,part_index+1, high);
        }
    }

    /**
     *
     * @param low starting index
     * @param high ending index
     */
    private void bigint_sort(BigInteger[] new_arr, int low, int high){
        if(low < high){
            int part_index = big_partition(new_arr, low, high);

            big_partition(new_arr, low,part_index-1);
            big_partition(new_arr,part_index+1, high);
        }
    }


    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right
     * of pivot
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private int int_partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right
     * of pivot
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private int double_partition(double[] arr, int low, int high){
        double pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        double temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right
     * of pivot
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private int float_partition(float[] arr, int low, int high){
        float pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                float temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        float temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right
     * of pivot
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private int long_partition(Long[] arr, int low, int high){
        Long pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                Long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Long temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /**
     * This function takes last element as pivot, places
     * the pivot element at its correct position in sorted
     * array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right
     * of pivot
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private int big_partition(BigInteger[] arr, int low, int high){
        BigInteger pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j].compareTo(pivot) == -1)
            {
                i++;

                // swap arr[i] and arr[j]
                BigInteger temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        BigInteger temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }



}
