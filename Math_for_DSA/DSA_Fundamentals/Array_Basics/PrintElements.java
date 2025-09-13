package DSA.Math_for_DSA.DSA_Fundamentals.Array_Basics;
import java.util.*;

public class PrintElements {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        // get input elements in an array and store into the array
        for(int i=0;i<arr.length;i++) {
            System.out.println("Enter the element into the array :");
            int element = sc.nextInt();
            arr[i] = element;
        }
        // print the array elements and their index
        for(int j=0;j<arr.length;j++) {
            System.out.print("index : "+j+" ");
            System.out.print("element : "+arr[j]);
            System.out.println();
        }

   } 
}
