package DSA.Math_for_DSA.DSA_Fundamentals;

public class Polindrome {
    public static boolean PoliCheck(int num) {
        int copy = num;
        int reverse = 0;
        while(num > 0) {
            int lastDigit = num%10;
            reverse = (reverse*10)+lastDigit;
            num = num/10;
        }
        if(copy == reverse) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 1551;
        boolean res = PoliCheck(num);
        System.out.println(res);
    }
}
