package DSA.Math_for_DSA.DSA_Fundamentals.Array_Basics;
import java.util.*;

public class DuplicateArr {
    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        System.out.println("Original array : "+Arrays.toString(arr));
        int[] copy = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            copy[i] = arr[i];
        }
        
        System.out.println("Copy array : "+Arrays.toString(copy));
    }
}