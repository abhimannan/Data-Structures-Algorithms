package DSA.Math_for_DSA.DSA_Fundamentals;

public class SumFirstandlast {
    
    public static void main(String[] args) {
        int num = 143;
        int sum = 0;
        int ld = num % 10;
        sum+=ld;
        while(num >0) {
            num = num/10;
            if(num>=0 && num<=9) {
                sum = sum+num;
            }
        }
        System.out.println(sum);
    }
}
