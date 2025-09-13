package DSA.Math_for_DSA.DSA_Fundamentals;
import java.util.*;

public class AmstrongNumber {
    static boolean checkAmstrong(int num) {
        int copy = num;
        int countCopy = num;
        // find how many number of digits are there
        int count = 0;
        while(countCopy > 0) {
            count++;
            countCopy = countCopy/10;
        }
        int sum = 0;
        while(num > 0) {
            int lastDigit = num%10;
            sum+=((int)Math.pow(lastDigit,count));
            num = num/10;
        }
        if(sum == copy) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();

        // int num = 371;
        // System.out.println(checkAmstrong(num));
        // print amstrong number from range
        for(int i=1;i<=range;i++) {
            if(checkAmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
