package DSA.Math_for_DSA.DSA_Fundamentals;

public class ProductDigits {
    public static void main(String[] args) {
        int num = 143;
        int product = 1;
        while(num>0) {
            int lastDigit = num%10;
            product = product*lastDigit;
            num = num/10;
        }
        System.out.println(product);
    }
}
