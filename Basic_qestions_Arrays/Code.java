package My_Journey_challenge.java.Arrays.Basic_qestions;
import java.util.*;
public class Code {
    // Write a java program to find second largest element in an array. If not exist, then return -1.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            System.out.print("Enter array element:");
            int input = sc.nextInt();
            arr[i] = input;
        }
        int large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}