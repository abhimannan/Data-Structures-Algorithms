package DSA.Math_for_DSA.DSA_Fundamentals;

public class StrongNum {
    static int Factorial(int n) {
        int fact = 1;
        for(int i=n;i>=1;i--) {
            fact = fact*i;
        }
        return fact;
    } 
    static boolean CheckStrongNum(int num) {
        int sum = 0;
        int copy = num;
        while(num > 0) {
            int lastDigit = num%10;
            sum+=Factorial(lastDigit);
            num/=10;
        }
        if(sum == copy) {
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        int num = 145;
        int range = 1000;
        for(int i=1;i<=range;i++) {
            if(CheckStrongNum(i)) {
                System.out.print(i+" ");
            }
        }        
        // System.out.println(CheckStrongNum(num));
    }
}