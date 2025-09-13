package DSA.Math_for_DSA.DSA_Fundamentals;

public class PrimeCheck {
    static boolean Prime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println(Prime(n));
    }
}
