package DSA.Math_for_DSA;

public class PrimeApproach {
    public static void PrimeRange(int n,boolean[] prime) {
        // if prime[i] == false is prime numbers
        for(int i=2;i<Math.sqrt(n);i++) {
            if(!prime[i]) {
                // make all the multiples of number will become true
                for(int j=i*2;j<=n;j+=i) {
                    prime[j] = true;
                }
            }
        }
        // print all the numbers where prime[i] == false
        for(int i=2;i<=n;i++) {
            if(!prime[i]) {// prime[i] == false
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];
        PrimeRange(n,prime);

    }
}
