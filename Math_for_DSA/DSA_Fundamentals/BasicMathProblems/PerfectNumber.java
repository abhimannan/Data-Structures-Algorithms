package DSA.Math_for_DSA.DSA_Fundamentals;

public class PerfectNumber {
    static boolean checkPerfectNumber(int num) {
        int sum = 0;
        int copy = num;
        for(int i=1;i<=num/2;i++) {
            if(num%i == 0) {
                sum=sum+i;
            }
        }
        if(sum == copy) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 6;
        int range = 100;
        System.out.println(checkPerfectNumber(num));
        for(int i=1;i<=range;i++) {
            if(checkPerfectNumber(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
