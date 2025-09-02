package DSA.Math_for_DSA.DSA_Fundamentals;
import java.util.*;

public class ElectricBill {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the electricitu units : ");
        int units = sc.nextInt();
        int bill = 0;
        if(units <=50) {
            bill+=(units * 0.50);
        }
        else if(units>50 && units<=100) {
            bill+=(units * 0.75);
        }
        else if(units>100 && units<=250) {
            bill+=(units * 1.20);
        }
        else {
            bill+=(units * 1.50);
        }
        int extra = (20/100) * bill;
        bill = bill+extra;
        System.out.println(bill);
    }
}
