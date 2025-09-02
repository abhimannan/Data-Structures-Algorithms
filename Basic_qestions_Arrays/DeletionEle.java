import java.util.*;

public class DeletionEle {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2;
        int n = arr.length;
        int[] newArr = new int[4];
        for(int i=pos-1;i<n-1;i++) {
            arr[i] = arr[i+1];
        }
        for(int i : arr) {
            System.out.print(i+" ");
        }
        // for(int i=0;i<arr.length;i++) {
        //     System.out.println(arr[i]);
        // }


    }
}
