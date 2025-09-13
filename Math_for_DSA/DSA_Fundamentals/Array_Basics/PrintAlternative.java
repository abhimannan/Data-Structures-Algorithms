package DSA.Math_for_DSA.DSA_Fundamentals.Array_Basics;

import java.util.ArrayList;
import java.util.*;

public class PrintAlternative {
    public static void main(String[] args) {
        int[] arr = {1,2,9,5,6,7,8,2,3};
        int[] ans = new int[(arr.length/2)+1];
        int index = 0;
        for(int i=0;i<arr.length;i=i+2) {
            ans[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(ans));
    }
}