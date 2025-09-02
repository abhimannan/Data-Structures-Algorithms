package DSA.Math_for_DSA.DSA_Fundamentals.Recap;

public class Lcm {
    public static int gcd(int a,int b) {
        while(a>0 && b>0) {
            if(a>0) {
                a=a%b;
            }
            else {
                b=b%a;
            }
        }
        if(a==0) {
                return b;
            }
            else {
                return a;
            }
    }
    public static void getLcm(int a,int b) {
        System.out.print((a*b)/gcd(a,b));
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println("abhi");
        getLcm(a,b);
    }
}
// brute force solution
/*
        int a = 9;
        int b = 12;
        int start = Math.max(a,b);
        while(true) {
            if(start%a == 0 && start%b == 0) {
                break;
            }
            start++;
        }
        System.out.println(start);
        */
