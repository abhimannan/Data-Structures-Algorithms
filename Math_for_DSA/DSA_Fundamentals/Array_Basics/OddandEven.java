package DSA.Math_for_DSA.DSA_Fundamentals.Array_Basics;
import java.util.*;

public class OddandEven {
    public static void main(String[] args) {
        int[] arr = {4,8,115,16,23,42};
        int N = arr.length;
        int evenCount = 0;
        int oddCount = 0;
        // count the no. of even and odd elements
        for(int i=0;i<N;i++) {
            if(arr[i]%2==0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        // create the even and odd array for insetring values
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;
        // Travel through out the array and insert into the respective array even or odd array
        for(int j=0;j<N;j++) {
            if(arr[j]%2 == 0) {
                even[evenIndex] = arr[j];
                evenIndex++;
            }
            else {
                odd[oddIndex] = arr[j];
                oddIndex++;
            }
        }
        // print the arrays
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
}