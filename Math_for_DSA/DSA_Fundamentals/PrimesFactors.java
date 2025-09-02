import java.util.ArrayList;

public class PrimesFactors {
    static boolean isPrime(int n) {
        int count = 0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                count++;
                if(n/i != i) {
                    count++;
                }
            }
        }
        if(count == 2) {
            return true;
        }
        else {
            return false;
        } 
    }
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                if(isPrime(i)) {
                    arr.add(i);
                    if(n/i != i) {
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
