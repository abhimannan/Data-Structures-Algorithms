package DSA.Math_for_DSA.DSA_Fundamentals;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int num = 36;
        // bruteforce - O(N)
        /*
            for(int i=1;i<=num;i++) {
                if(num%i == 0) {
                    System.out.print(i+" ");
                }
            }
        */
        // TC = O(sqrt(N))
        /*
        for(int i=1;i<Math.sqrt(num);i++) {
            if(num%i == 0) {
                System.out.print(i+" ");
                System.out.print(num/i+" ");
            }
        }
        */
        // sorting
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(num);i++) {
            if(num%i == 0) {
                System.out.print(i+" ");
                if(num/i != i) {
                     arr.add(num/i);
                }
            }
        }
        for(int i=arr.size()-1;i>=0;i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}