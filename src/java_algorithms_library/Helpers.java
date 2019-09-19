package java_algorithms_library;

import java.math.BigInteger;

public class Helpers {
    
    /**
     * This is used to check if the array of Strings is an array of ints
     * @param arr This is the given  string array
     * @return true if validates into a array of integers false otherwise
     */
    public static boolean validate_integer_array(String[] arr){
        try {
            for(int i = 0;i < arr.length;i++){
                int x = Integer.parseInt(arr[i]);
            }
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    
    /**
     * This is used to check if the array of Strings is an array of floats
     * @param arr This is the given  string array
     * @return true if validates into a array of floats false otherwise
     */
    public static boolean validate_float_array(String[] arr){
        try {
            for(int i = 0;i < arr.length;i++){
                float x = Float.parseFloat(arr[i]);
            }
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    
    /**
     * This is used to check if the array of Strings is an array of doubles
     * @param arr This is the given  string array
     * @return true if validates into a array of doubles false otherwise
     */
    public static boolean validate_double_array(String[] arr){
        try {
            for(int i = 0;i < arr.length;i++){
                double x = Double.parseDouble(arr[i]);
            }
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    
    /**
     * This is used to check if the array of Strings is an array of longs
     * @param arr This is the given  string array
     * @return true if validates into a array of longs false otherwise
     */
    public static boolean validate_long_array(String[] arr){
        try {
            for(int i = 0;i < arr.length;i++){
                long x = Long.parseLong(arr[i]);
            }
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    
    /**
     * This is used to check if the array of Strings is an array of BigIntegers
     * @param arr This is the given  string array
     * @return true if validates into a array of BigIntegers false otherwise
     */
    public static boolean validate_bigint_array(String[] arr){
        try {
            for(int i = 0;i < arr.length;i++){
                BigInteger x = new BigInteger(arr[i]);
            }
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}
