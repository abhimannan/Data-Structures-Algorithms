package DSA.Math_for_DSA;

public class Prime {
    public static boolean CheckPrime(int N) {
        if(N <= 1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(N);i++) {
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int N = 10;
        int count = 0;
        for(int i=1;i<N;i++) {
            if(CheckPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
