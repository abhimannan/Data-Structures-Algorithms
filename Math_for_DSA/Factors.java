package DSA.Math_for_DSA;

import java.util.ArrayList;

public class Factors {
    // TC = O(n)
    public static void approach1(int n) {
        for(int i=1;i<=n;i++) {
            if(n%i == 0) {
                System.out.print(i+" ");
            }
        }
    }
    // TC = O(sqrt(n))
     public static void approach2(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<Math.sqrt(n);i++) {
            if(n%i == i) {
                System.out.print(i);
            }
            if(n%i == 0) {
                System.out.print(i+" ");
                arr.add(n/i);
            }
        }
        for(int i=arr.size()-1;i>=0;i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
    // Both time & space complecity => O(sqrt(n))
     public static void approach3(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                if(n/i == i) { // 36 
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    arr.add(n/i);   // [20,10,5]
                }
            }
        }
        for(int i=arr.size()-1;i>=0;i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int n = 20;
        approach2(n);
    }
}
