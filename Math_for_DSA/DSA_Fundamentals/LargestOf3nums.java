package DSA.Math_for_DSA.DSA_Fundamentals;
import java.util.*;

public class LargestOf3nums {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Num1");
            int num1 = sc.nextInt();
            System.out.println("Enter the Num2");
            int num2 = sc.nextInt();
            System.out.println("Enter the Num3");
            int num3 = sc.nextInt();
            int large = Integer.MIN_VALUE;
            if(num1 > num2 && num1 > num3) {
                System.out.println("largest num : "+ num1);
            }
            else if(num2 > num1 && num2 > num3) {
                System.out.println("largest num : "+ num2);
            }
            else{
                System.out.println("largest num : "+ num3);
            }
        
    }
}
