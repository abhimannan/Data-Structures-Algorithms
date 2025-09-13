package DSA.Math_for_DSA.DSA_Fundamentals;
import java.util.*;

public class Triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        System.out.println("Enter c value");
        int c = sc.nextInt();
        if(a==b && b==c) {
            System.out.println("Equilateral Trangle");
        }
        else if(a==b || a==c || b==c) {
            System.out.println("Isolated Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }

    }
}
