package DSA.Math_for_DSA.DSA_Fundamentals;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int exp = 3;
        int res = 1;
        for(int i=0;i<exp;i++) {
            res = res*base;
        }
        System.out.println(res);
    }
    
}
