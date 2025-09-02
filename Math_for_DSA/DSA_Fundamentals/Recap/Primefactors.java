package DSA.Math_for_DSA.DSA_Fundamentals.Recap;

import java.util.ArrayList;

public class Primefactors {
    public static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 36;
        // brute // optimal
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                if(isPrime(i)){
                    arr.add(i);
                    if(n/i != i){
                        if(isPrime(n/i)) {
                            arr.add(n/i);
                        }
                    }
                }
            
            }
        }
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
