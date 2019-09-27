package java_algorithms_library;

import java.math.BigInteger;

public class Heapsort {
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
    Heapsort(int[] incoming_array, boolean ord){
        int_arr = incoming_array;
        order = ord;
//        int_sort(Arrays.copyOf(int_arr, int_arr.length), 0, (int_arr.length - 1));
        int_sort(int_arr);
        string_arr = new String[int_arr.length];
        for(int i = 0; i < int_arr.length; i++){
            string_arr[i] = String.valueOf(int_arr[i]);
        }
        if(order == false){
            string_arr = Helpers.reverse_array(string_arr);
        }
    }

    Heapsort(float[] incoming_array, boolean ord){
        float_arr = incoming_array;
        order = ord;
        System.out.print(float_arr);
    }

    Heapsort(double[] incoming_array, boolean ord){
        double_arr = incoming_array;
        order = ord;
        System.out.print(double_arr);
    }

    Heapsort(Long[] incoming_array, boolean ord){
        long_arr = incoming_array;
        order = ord;
        System.out.print(long_arr);
    }

    Heapsort(BigInteger[] incoming_array, boolean ord){
        bigint_arr = incoming_array;
        order = ord;
        System.out.print(bigint_arr);
    }

    Heapsort(String[] incoming_array, boolean ord){
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

    private void int_sort(int[] arr){

    }

    private void heapify(int[] arr,  int heap_size, int index){

    }

    private void build_max_heap(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
    }


}
