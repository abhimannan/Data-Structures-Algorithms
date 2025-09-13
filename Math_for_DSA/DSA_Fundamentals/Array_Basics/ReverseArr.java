package DSA.Math_for_DSA.DSA_Fundamentals.Array_Basics;
import java.util.*;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int N = arr.length;
        int start = 0;
        int end = N-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}