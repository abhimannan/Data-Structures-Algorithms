package DSA.Math_for_DSA.DSA_Fundamentals.Switch_Statement;
import java.util.*;

public class Sample {
    static void Example1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 7 :");
        int number = sc.nextInt();
        switch(number) {
            case 1: 
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wedesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6: 
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Enter the number between 1 to 7");
        }
    }
    static void Example2(int n1,int n2) {
        int res = (n1>n2) ? 0 : ((n2>n1) ? 1 : 2);
        switch(res) {
            case 0:
                System.out.println("n1 is larger");
                break;
            case 1:
                System.out.println("n2 is larger");
                break;
            case 2:
                System.out.println("n1 == n2");
                break;
        }
    }
    static void EvenorOdd() {
        int num = -13;
        int res = (num%2==0) ? 0 : 1;
        switch(res){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the 1st number :");
        // int n1 = sc.nextInt();
        // System.out.print("Enter the 2nd number ");
        // int n2 = sc.nextInt();

        // Example2(n1,n2);
        EvenorOdd();
    }
}

